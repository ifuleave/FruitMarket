package com.sujin.fruit.domain;

import lombok.Getter;

@Getter
public class FruitProductOrderDetail {
	private Long orderdetailsId;   	//주문상세아이디
	private int orderdetailsPrice; 	// 주문금액
	private int orderdetailsAmount;	// 주문 수량
	private Long fruitorderId;		// 주문 아이디
	private Long fruitId;			// 상품 아이디
}
