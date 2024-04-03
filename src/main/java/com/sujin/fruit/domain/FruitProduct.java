package com.sujin.fruit.domain;

import lombok.Getter;

@Getter
public class FruitProduct {
										// 과일 상품
	private Long fruitId; 				// 과일아이디
	private String fruitName;			// 과일이름
	private int fruitPrice;				// 과일가격
	private int fruitAmount;			// 수량
	private Long fruitcartegoryId;		//카테고리
	
}
