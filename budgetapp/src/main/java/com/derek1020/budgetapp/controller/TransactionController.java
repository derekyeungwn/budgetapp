package com.derek1020.budgetapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.derek1020.budgetapp.model.Transaction;
import com.derek1020.budgetapp.service.TransactionService;

import jakarta.annotation.PostConstruct;

@RestController
@RequestMapping(value = "/expenses", produces = MediaType.APPLICATION_JSON_VALUE)
public class TransactionController {
	
	@PostConstruct
	//Execute after the creation of the controller
	private void init() {
		
	}
	
	@Autowired
    private TransactionService transactionService;
	
	//Get
    @GetMapping
    public ResponseEntity<List<Transaction>> getAllExpenses() {
    	return ResponseEntity.ok(transactionService.getAllExpenses());
    }

}
