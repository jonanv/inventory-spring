package com.jonanv.inventoryspringboot.services;

import org.springframework.http.ResponseEntity;

import com.jonanv.inventoryspringboot.model.Category;
import com.jonanv.inventoryspringboot.response.CategoryResponseRest;

public interface ICategoryService {
	
	public ResponseEntity<CategoryResponseRest> search();
	public ResponseEntity<CategoryResponseRest> searchById(Long id);
	public ResponseEntity<CategoryResponseRest> save(Category category);
	public ResponseEntity<CategoryResponseRest> update(Category category, Long id);

}
