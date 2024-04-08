package com.sujin.fruit.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.sujin.fruit.domain.FruitOrder;
import com.sujin.fruit.domain.FruitProduct;
import com.sujin.fruit.domain.FruitProductOrderDetail;
import com.sujin.fruit.dto.request.FruitProductOrderRequest;
import com.sujin.fruit.dto.request.FruitProductSaveRequest;
import com.sujin.fruit.dto.request.FruitProductUpdateRequest;
import com.sujin.fruit.dto.response.FruitListReponse;
import com.sujin.fruit.dto.response.FruitProductOneResponse;
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

		public List<FruitProduct> fruitProductList() {
			// TODO Auto-generated method stub
			return fruitProductMapper.fruitProductList();
		}
		// 이후 삭제
		public FruitProductOneResponse fruitProductOne(Long id) {
			// TODO Auto-generated method stub
			return fruitProductMapper.fruitProductOne(id);
		}

		public void fruitProductUpdate(Long id, FruitProductUpdateRequest request) {
			// TODO Auto-generated method stub
			fruitProductMapper.fruitProductUpdate(id,request);
		}

		public void deleteFruitProduct(Long id) {
			// TODO Auto-generated method stub
			fruitProductMapper.deleteFruitProduct(id);
		}

//		public Long fruitProductOrder(Long memberId, Long deliveryId) {
//			// TODO Auto-generated method stub
//			return fruitProductMapper.fruitProductOrder(memberId,deliveryId);
//		}

		public void fruitProductChangeAmount(int fruitAmount, Long fruitId) {
			// TODO Auto-generated method stub
			fruitProductMapper.fruitProductChangeAmount(fruitAmount,fruitId);
		}


		public void orderDetailSave(FruitProductOrderDetail orderDetail) {
			// TODO Auto-generated method stub
			fruitProductMapper.orderDetailSave(orderDetail);
		}

		public Long getFruitPoductOrderId(Long fruitOrderId) {
			// TODO Auto-generated method stub
			return fruitProductMapper.getFruitPoductOrderId(fruitOrderId);
		}

		public void fruitProductOrder(FruitOrder order) {
			// TODO Auto-generated method stub
			 fruitProductMapper.fruitProductOrder(order);
		}

}		

