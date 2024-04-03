package com.sujin.fruit.dto.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FruitProductSaveRequest {
	
	
	private String fruitName;
	private int fruitPrice;
	private int fruitAmount;
	private Long fruitcategoryId;
	
}
