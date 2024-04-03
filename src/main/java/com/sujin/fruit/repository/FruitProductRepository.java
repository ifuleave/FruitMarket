package com.sujin.fruit.repository;

import org.springframework.stereotype.Repository;

import com.sujin.fruit.dto.request.FruitProductSaveRequest;
import com.sujin.fruit.repository.mapper.FruitProductMapper;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class FruitProductRepository {

		private final FruitProductMapper fruitProductMapper;

		public void productSave(FruitProductSaveRequest request) {
			// TODO Auto-generated method stub
			fruitProductMapper.productSave(request);
		}
		
}
