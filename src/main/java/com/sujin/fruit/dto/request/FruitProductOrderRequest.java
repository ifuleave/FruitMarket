package com.sujin.fruit.dto.request;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FruitProductOrderRequest {

	private Long memberId;
	private Long fruitId;
	private int fruitAmount;
}
