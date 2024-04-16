package com.sujin.delivery.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
public class DeliveryInfo {

	private Long deliveryId;
	private DeliveryStatus deliveryStatus;  // READY,  COMP
	private String deliveryAddress;
	
}

enum DeliveryStatus{
	READY, COMP
}
