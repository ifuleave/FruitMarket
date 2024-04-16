package com.sujin.fruit.dto.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FruitProductOneResponse {

	private Long fruitId;
	private String fruitName;
	private int fruitPrice;
	private int fruitAmount;
	private Long fruitcategoryId;
	
}
