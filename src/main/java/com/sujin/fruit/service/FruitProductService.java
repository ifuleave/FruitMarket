package com.sujin.fruit.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sujin.fruit.dto.request.FruitProductSaveRequest;
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
		
}
