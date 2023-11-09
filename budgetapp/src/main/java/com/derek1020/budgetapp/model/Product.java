package com.derek1020.budgetapp.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "products")
public class Product {
    private String id;
    private String name;

    public Product() {
    }

    
    public Product(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    
    public void setId(String a) {
    	this.id = id;
    }
    
    public void setName(String name) {
    	this.name = name;
    }
}