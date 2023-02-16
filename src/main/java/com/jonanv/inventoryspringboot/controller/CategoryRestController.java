package com.jonanv.inventoryspringboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jonanv.inventoryspringboot.response.CategoryResponseRest;
import com.jonanv.inventoryspringboot.services.ICategoryService;

@RestController
@RequestMapping("/api/v1")
public class CategoryRestController {
	
	@Autowired
	private ICategoryService service;
	
	@GetMapping("/categories")
	public ResponseEntity<CategoryResponseRest> searchCategory() {
		
		ResponseEntity<CategoryResponseRest> response = service.search();
		return response;
		
	}

}
