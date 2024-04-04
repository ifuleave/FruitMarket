package com.sujin.fruit.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sujin.fruit.dto.request.FruitProductSaveRequest;
import com.sujin.fruit.dto.request.FruitProductUpdateRequest;
import com.sujin.fruit.dto.response.FruitListReponse;
import com.sujin.fruit.dto.response.FruitProductOneResponse;
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
	
	@GetMapping("/api/fruits")
	public List<FruitListReponse> fruitProductList(){
		return fruitProductService.fruitProductList();
	}
	
	@GetMapping("/api/fruits/{id}")
	public FruitProductOneResponse fruitProductOne(@PathVariable Long id) {
		return fruitProductService.fruitProductOne(id);
	}
	
	@PutMapping("/api/fruits/{id}")
	public void fruitProductUpdate(@PathVariable Long id, FruitProductUpdateRequest request) {
		fruitProductService.fruitProductUpdate(id,request);
	}
	
	@DeleteMapping("/api/fruits/{id}")
	public void deleteFruitProduct(@PathVariable Long id) {
		fruitProductService.deleteFruitProduct(id);
	}
	
}
