package com.jonanv.inventoryspringboot.dao;

import org.springframework.data.repository.CrudRepository;

import com.jonanv.inventoryspringboot.model.Category;

	public interface ICategoryDao extends CrudRepository<Category, Long> {

}
