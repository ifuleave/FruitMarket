package com.sujin.fruit.dto.response;




import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderDetilsListReponse {

	private Long fruitOrderId;			// 주문아이디
	private OrderMember member;		// 유저정보
	private DetailOrder product;	// 주문상품
	private String memberAddress;	// 주소
	private String orderStatus;		// 주문상태 
}
