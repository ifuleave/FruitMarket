package com.sujin.fruit.dto.request;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FruitProductOrderRequest {

	@NotNull(message = "상품 아이디는 필수 입력 값입니다.")
	private Long memberId;
	private Long fruitId;
	private int fruitAmount;
}
