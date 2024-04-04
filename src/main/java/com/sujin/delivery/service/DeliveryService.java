package com.sujin.delivery.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sujin.delivery.repository.DeliveryRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class DeliveryService {
	private final DeliveryRepository deliveryRepository;

}
