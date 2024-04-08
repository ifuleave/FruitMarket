package com.sujin.delivery.repository.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.sujin.delivery.domain.DeliveryInfo;


@Mapper
public interface DeliveryMapper {

	Long getdeliveryId();

	Long save(String memberAddress);

}
