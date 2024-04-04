package com.sujin.fruit.repository.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.sujin.fruit.domain.FruitProduct;
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

	void fruitProductUpdate(Long id, FruitProductUpdateRequest request);

	void deleteFruitProduct(Long id);

}
