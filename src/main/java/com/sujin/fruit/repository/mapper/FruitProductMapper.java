package com.sujin.fruit.repository.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.sujin.fruit.domain.FruitProduct;
import com.sujin.fruit.dto.request.FruitProductOrderRequest;
import com.sujin.fruit.dto.request.FruitProductSaveRequest;
import com.sujin.fruit.dto.request.FruitProductUpdateRequest;
import com.sujin.fruit.dto.response.FruitListReponse;
import com.sujin.fruit.dto.response.FruitProductOneResponse;

@Mapper
public interface FruitProductMapper {

	void productSave(FruitProductSaveRequest request);

	List<FruitProduct> fruitProductList();

	FruitProductOneResponse fruitProductOnt(Long id);

	FruitProductOneResponse fruitProductOne(Long id);

	void fruitProductUpdate(@Param("id") Long id,@Param("request") FruitProductUpdateRequest request);

	void deleteFruitProduct(Long id);

	void fruitProductOrder(@Param("memberId")Long memberId, @Param("deliveryId")Long deliveryId);

	FruitProduct fruitProductChangeAmount(@Param("fruitAmount")int fruitAmount,@Param("fruitId") Long fruitId);

	Long getOrderId(@Param("memberId")Long memberId,@Param("deliveryId") Long deliveryId);

	void orderDetailSave(@Param("fruitId")Long fruitId,@Param("fruitorderId") Long fruitorderId, @Param("requestAmount")int requestAmount, @Param("sumPrice")int sumPrice);

}
