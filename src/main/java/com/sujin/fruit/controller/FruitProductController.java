package com.sujin.fruit.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sujin.fruit.dto.request.FruitProductSaveRequest;
import com.sujin.fruit.service.FruitProductService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class FruitProductController {
	
	private final FruitProductService fruitProductService;
	
	@PostMapping("/api/fruits")
	public void productSave(@RequestBody FruitProductSaveRequest request) {
		fruitProductService.productSave(request);
	}
	
		
}
