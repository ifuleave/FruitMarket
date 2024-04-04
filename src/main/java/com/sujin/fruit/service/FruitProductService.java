package com.sujin.fruit.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sujin.fruit.domain.FruitProduct;
import com.sujin.fruit.dto.request.FruitProductSaveRequest;
import com.sujin.fruit.dto.request.FruitProductUpdateRequest;
import com.sujin.fruit.dto.response.FruitListReponse;
import com.sujin.fruit.dto.response.FruitProductOneResponse;
import com.sujin.fruit.repository.FruitProductRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class FruitProductService {
		
	private final FruitProductRepository fruitProductRepository;

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
		
}
