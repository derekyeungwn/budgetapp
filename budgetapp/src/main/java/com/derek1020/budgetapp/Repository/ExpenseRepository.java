package com.derek1020.budgetapp.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.derek1020.budgetapp.model.Expense;

public interface ExpenseRepository extends MongoRepository<Expense, String>{
}
