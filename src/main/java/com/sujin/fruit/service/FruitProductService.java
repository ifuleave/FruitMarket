package com.sujin.fruit.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sujin.delivery.domain.DeliveryInfo;
import com.sujin.delivery.repository.DeliveryRepository;
import com.sujin.fruit.domain.FruitOrder;
import com.sujin.fruit.domain.FruitProduct;
import com.sujin.fruit.domain.FruitProductOrderDetail;
import com.sujin.fruit.dto.request.FruitProductOrderRequest;
import com.sujin.fruit.dto.request.FruitProductSaveRequest;
import com.sujin.fruit.dto.request.FruitProductUpdateRequest;
import com.sujin.fruit.dto.request.OrderDetilsListRequest;
import com.sujin.fruit.dto.response.DetailOrder;
import com.sujin.fruit.dto.response.FruitListReponse;
import com.sujin.fruit.dto.response.FruitProductOneResponse;
import com.sujin.fruit.dto.response.OrderDetilsListReponse;
import com.sujin.fruit.dto.response.OrderMember;
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
			reponse.setFruitcategoryId(product.get(i).getFruitcategoryId());
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
		
		// 1. 회원을 가져온다.
		Member user = memberRepository.getUserId(request.getMemberId());
		
		// 2. 회원의 배송지정보를 가져와서  배송지 저장/ deliveryId 가져오기
		Long deliveryId = deliveryRepository.save(user.getMemberAddress());
			
		
		FruitOrder order = new FruitOrder(request.getMemberId(),deliveryId);
		 
		// 상품 주문테이블에 insert 
		  fruitProductRepository.fruitProductOrder(order);
		
		// 주문정보가져와서 , 상세 저장 
		FruitProductOneResponse fruitProduct = fruitProductRepository.fruitProductOne(request.getFruitId());
		
		
		if (fruitProduct == null) {
			throw new IllegalArgumentException("존재하지 않는 상품입니다.");
		} else if (fruitProduct.getFruitAmount() < request.getFruitAmount()) {
			throw new IllegalArgumentException("상품 수량을 초과했습니다.");
		}
		
		FruitProductOrderDetail orderDetail = new FruitProductOrderDetail();
		orderDetail.setOrderDetailsPrice(request.getFruitAmount()*fruitProduct.getFruitPrice());
		orderDetail.setOrderDetailsAmount(request.getFruitAmount());
		orderDetail.setFruitOrderId(order.getFruitorderId());
		orderDetail.setFruitId(fruitProduct.getFruitId());
		
		fruitProductRepository.orderDetailSave(orderDetail);
		
		// 원래 수량-상품 수량 update
		fruitProductRepository.fruitProductChangeAmount(request.getFruitAmount(),request.getFruitId());
	}

	public List<OrderDetilsListReponse> orderDetailsList(String orderStatus, String userName) {		
		// TODO - 가격, 전체 카테고리 바꾸기(사과) 
		return fruitProductRepository.orderDetailsList(orderStatus,userName);
	}
}
