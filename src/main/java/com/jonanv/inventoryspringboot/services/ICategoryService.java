package com.jonanv.inventoryspringboot.services;

import org.springframework.http.ResponseEntity;

import com.jonanv.inventoryspringboot.response.CategoryResponseRest;

public interface ICategoryService {
	
	public ResponseEntity<CategoryResponseRest> search();

}
