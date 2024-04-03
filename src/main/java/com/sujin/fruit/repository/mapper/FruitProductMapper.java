package com.sujin.fruit.repository.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.sujin.fruit.dto.request.FruitProductSaveRequest;

@Mapper
public interface FruitProductMapper {

	void productSave(FruitProductSaveRequest request);

}
