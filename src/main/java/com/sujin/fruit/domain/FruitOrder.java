package com.sujin.fruit.domain;

import lombok.Getter;

@Getter
public class FruitOrder {
	private Long fruitorderId;			// 상품주문 아이디
	private FruitOrderStatus orderStatus;		// 주문 상태 디폴트  ORDER,  CANCEL
	private Long memberId;				// 주문자
	private Long deliveryId;			// 배송정보아이디 아이디
	
	public FruitOrder(Long memberId, Long deliveryId) {
		this.orderStatus = FruitOrderStatus.ORDER;
		this.memberId = memberId;
		this.deliveryId = deliveryId;
	}
}

enum FruitOrderStatus{
	ORDER, CANCEL
}
