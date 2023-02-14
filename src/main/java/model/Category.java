package model;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="category")
public class Category implements Serializable{

	private static final long serialVersionUID = -8584834441521355363L;
	
	private Long id;
	private String name;
	private String description;

}
