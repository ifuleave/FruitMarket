package com.sujin.fruit.dto.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DetailOrder {
	
	private String fruitName;
	private String fruitCategoryName;
	private int orderDetailsPrice;
	private int orderDetailsAmount;
	
}
