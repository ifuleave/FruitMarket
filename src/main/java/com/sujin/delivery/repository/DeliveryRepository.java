package com.sujin.delivery.repository;

import org.springframework.stereotype.Repository;

import com.sujin.delivery.domain.DeliveryInfo;
import com.sujin.delivery.repository.mapper.DeliveryMapper;

import lombok.RequiredArgsConstructor;


@Repository
@RequiredArgsConstructor
public class DeliveryRepository {
		private final DeliveryMapper deliveryMapper;

		public Long getdeliveryId() {
			// TODO Auto-generated method stub
			return deliveryMapper.getdeliveryId();
		}

		public Long save(String memberAddress) {
			// TODO Auto-generated method stub
			return deliveryMapper.save(memberAddress);
		}
}
