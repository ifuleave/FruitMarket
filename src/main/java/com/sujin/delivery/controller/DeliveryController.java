package com.sujin.delivery.controller;

import org.springframework.web.bind.annotation.RestController;

import com.sujin.delivery.service.DeliveryService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class DeliveryController {
		private final DeliveryService deliveryService;
}
