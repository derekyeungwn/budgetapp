package com.derek1020.budgetapp.model;

import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "expenses")
public class Expense {
	private String id;
	private Date date;
	private double amount;
	
	public Expense() {
		
	}

    public String getId() {
        return id;
    }
    
    public void setId(String id) {
    	this.id = id;
    }

    public Date getDate() {
        return date;
    }
    
    public void setDate(Date date) {
    	this.date = date;
    }
    
    public double getAmount() {
        return amount;
    }
    
    public void setAmount(double amount) {
    	this.amount = amount;
    }
}
