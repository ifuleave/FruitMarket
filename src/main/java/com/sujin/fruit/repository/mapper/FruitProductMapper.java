package com.sujin.fruit.repository.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.sujin.fruit.domain.FruitOrder;
import com.sujin.fruit.domain.FruitProduct;
import com.sujin.fruit.domain.FruitProductOrderDetail;
import com.sujin.fruit.dto.request.FruitProductOrderRequest;
import com.sujin.fruit.dto.request.FruitProductSaveRequest;
import com.sujin.fruit.dto.request.FruitProductUpdateRequest;
import com.sujin.fruit.dto.response.FruitListReponse;
import com.sujin.fruit.dto.response.FruitProductOneResponse;
import com.sujin.fruit.dto.response.OrderDetilsListReponse;

@Mapper
public interface FruitProductMapper {

	void productSave(FruitProductSaveRequest request);

	List<FruitProduct> fruitProductList();

	FruitProductOneResponse fruitProductOne(Long id);

	void fruitProductUpdate(@Param("id") Long id,@Param("request") FruitProductUpdateRequest request);

	void deleteFruitProduct(Long id);

	//Long fruitProductOrder(@Param("memberId")Long memberId, @Param("deliveryId")Long deliveryId);

	void fruitProductChangeAmount(@Param("fruitAmount")int fruitAmount,@Param("fruitId") Long fruitId);

	Long getOrderId(@Param("memberId")Long memberId,@Param("deliveryId") Long deliveryId);

	void orderDetailSave(FruitProductOrderDetail orderDetail);

	Long getFruitPoductOrderId(Long fruitOrderId);

	void fruitProductOrder(FruitOrder order);

	List<OrderDetilsListReponse> orderDetailsList(@Param("orderStatus")String orderStatus,@Param("userName") String userName);


}
