package com.derek1020.budgetapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.derek1020.budgetapp.Repository.TransactionRepository;
import com.derek1020.budgetapp.model.Transaction;
//test23
@Service
public class TransactionService {
	
	@Autowired
    private TransactionRepository repository;

	public List<Transaction> getAllExpenses() {	
		return repository.findAll();
	}
}
