package com.derek1020.budgetapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.derek1020.budgetapp.Repository.ExpenseRepository;
import com.derek1020.budgetapp.model.Expense;
//test23
@Service
public class ExpenseService {
	
	@Autowired
    private ExpenseRepository repository;

	public List<Expense> getAllExpenses() {	
		return repository.findAll();
	}
}
