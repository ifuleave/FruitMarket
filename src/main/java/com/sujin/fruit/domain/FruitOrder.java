package com.sujin.fruit.domain;

import lombok.Getter;

@Getter
public class FruitOrder {
	private Long fruitorderId;			// 상품주문 아이디
	private int fruitorderStatus;		// 주문 상태 디폴트 0 //주문완료 1배송중 2배송완료
	private Long memberId;				// 주문자
	private Long deliveryId;			// 배송정보아이디 아이디
}
