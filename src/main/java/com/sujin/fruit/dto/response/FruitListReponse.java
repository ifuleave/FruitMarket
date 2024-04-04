package com.sujin.fruit.dto.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FruitListReponse {
	
	private Long fruitId;			// 상품 아이디
	private String fruitName;		// 상품명
	private int fruitPrice;			// 가격
	private int fruitAmount;		// 수량
	private Long fruitcategoryId;	// 카테고리 아이디
	
}
