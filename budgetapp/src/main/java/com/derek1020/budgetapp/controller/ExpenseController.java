package com.derek1020.budgetapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.derek1020.budgetapp.model.Expense;
import com.derek1020.budgetapp.model.Product;
import com.derek1020.budgetapp.service.ExpenseService;
import com.derek1020.budgetapp.service.ProductService;

import jakarta.annotation.PostConstruct;

@RestController
@RequestMapping(value = "/expenses", produces = MediaType.APPLICATION_JSON_VALUE)
public class ExpenseController {
	
	@PostConstruct
	//Execute after the creation of the controller
	private void init() {
		
	}
	
	@Autowired
    private ExpenseService expenseService;
	
	//Get
    @GetMapping
    public ResponseEntity<List<Expense>> getAllExpenses() {
    	return ResponseEntity.ok(expenseService.getAllExpenses());
    }

}
