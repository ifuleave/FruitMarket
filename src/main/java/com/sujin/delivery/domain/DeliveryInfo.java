package com.sujin.delivery.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DeliveryInfo {

	private Long deliveryId;
	private String deliveryStatus; // READY,  COMP
	private String deliveryAddress;
	
}
