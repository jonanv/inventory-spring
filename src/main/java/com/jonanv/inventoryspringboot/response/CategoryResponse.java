package com.jonanv.inventoryspringboot.response;

import java.util.List;

import com.jonanv.inventoryspringboot.model.Category;

import lombok.Data;

@Data
public class CategoryResponse {
	
	private List<Category> category;

}
