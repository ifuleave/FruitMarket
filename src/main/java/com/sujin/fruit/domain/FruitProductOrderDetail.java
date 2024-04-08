package com.sujin.fruit.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FruitProductOrderDetail {
	private Long orderDetailsId;//주문상세아이디
	private int orderDetailsPrice; 	// 주문금액
	private int orderDetailsAmount;	// 주문 수량
	private Long fruitOrderId;		// 주문 아이디
	private Long fruitId;			// 상품 아이디
	
	public FruitProductOrderDetail( int orderDetailsPrice, int orderDetailsAmount,
			Long fruitOrderId, Long fruitId) {
		this.orderDetailsPrice = orderDetailsPrice;
		this.orderDetailsAmount = orderDetailsAmount;
		this.fruitOrderId = fruitOrderId;
		this.fruitId = fruitId;
	}

	public FruitProductOrderDetail() {
		// TODO Auto-generated constructor stub
	}
	
	
	
}
