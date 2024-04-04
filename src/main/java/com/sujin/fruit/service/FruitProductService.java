package com.sujin.fruit.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sujin.delivery.repository.DeliveryRepository;
import com.sujin.fruit.domain.FruitProduct;
import com.sujin.fruit.dto.request.FruitProductOrderRequest;
import com.sujin.fruit.dto.request.FruitProductSaveRequest;
import com.sujin.fruit.dto.request.FruitProductUpdateRequest;
import com.sujin.fruit.dto.response.FruitListReponse;
import com.sujin.fruit.dto.response.FruitProductOneResponse;
import com.sujin.fruit.repository.FruitProductRepository;
import com.sujin.member.domain.Member;
import com.sujin.member.repository.MemberRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class FruitProductService {
		
	private final FruitProductRepository fruitProductRepository;
	private final MemberRepository memberRepository;
	private final DeliveryRepository deliveryRepository;

	@Transactional
	public void productSave(FruitProductSaveRequest request) {
		// TODO Auto-generated method stub
		fruitProductRepository.productSave(request);
	}

	public List<FruitListReponse> fruitProductList() {
		// TODO Auto-generated method stub
		// FruitProduct<List> -> FruitListResponse<List>
		List<FruitProduct> product = fruitProductRepository.fruitProductList();
		List<FruitListReponse> list = new ArrayList<>();
		
		for(int i=0 ; i < product.size(); i++) {
			FruitListReponse reponse = new FruitListReponse();
			reponse.setFruitId(product.get(i).getFruitId());
			reponse.setFruitPrice(product.get(i).getFruitPrice());
			reponse.setFruitName(product.get(i).getFruitName());
			reponse.setFruitAmount(product.get(i).getFruitAmount());
			reponse.setFruitcategoryId(product.get(i).getFruitcartegoryId());
			list.add(reponse);
		}
		return list;
	}

	public FruitProductOneResponse fruitProductOne(Long id) {
		// TODO Auto-generated method stub
		return fruitProductRepository.fruitProductOne(id);
	}

	@Transactional
	public void fruitProductUpdate(Long id, FruitProductUpdateRequest request) {
		// TODO Auto-generated method stub
		fruitProductRepository.fruitProductUpdate(id,request);
	}
	
	@Transactional
	public void deleteFruitProduct(Long id) {
		// TODO Auto-generated method stub
		fruitProductRepository.deleteFruitProduct(id);
	}

	@Transactional
	public void fruitProductOrder(FruitProductOrderRequest request) {
		// TODO Auto-generated method stub
		// 1.어떤 회원이 주문을 하는지 회원을 가지고 온다.
		// 2. 어떤 상품을 주문할것인지 FruitProduct를 조회해온다.
		// 회원이 있고, 상품이 존재한다면 주문
		// 		 - 상품을 주문할떄 수량을 초과 X,  주문 수량만큼 상품의 재고가 차감 
		
		Member user = memberRepository.getUserId(request.getMemberId());
		FruitProductOneResponse product = fruitProductRepository.fruitProductOne(request.getFruitId());
		
		if (user == null) {
			throw new IllegalArgumentException("존재하지 않는 회원입니다.");
		} else if (product == null) {
			throw new IllegalArgumentException("존재하지 않는 상품입니다.");
		} else if (product.getFruitAmount() < request.getFruitAmount()) {
			throw new IllegalArgumentException("상품 수량을 초과했습니다.");
		}
		
		Long deliveryId = deliveryRepository.getdeliveryId();
		fruitProductRepository.fruitProductOrder(request.getMemberId(),deliveryId);
		Long fruitorderId = fruitProductRepository.getOrderId(request.getMemberId(),deliveryId);
		fruitProductRepository.fruitProductChangeAmount(request.getFruitAmount(),request.getFruitId());
		int requestAmount  =  request.getFruitAmount();
		int sumPrice = requestAmount * product.getFruitPrice();
		
		fruitProductRepository.orderDetailSave(request.getFruitId(),fruitorderId,requestAmount,sumPrice);
		
	}
		
}
