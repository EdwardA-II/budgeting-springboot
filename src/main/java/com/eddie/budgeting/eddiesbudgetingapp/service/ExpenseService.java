package com.eddie.budgeting.eddiesbudgetingapp.service;

import com.eddie.budgeting.eddiesbudgetingapp.model.Budget;
import com.eddie.budgeting.eddiesbudgetingapp.model.Expense;
import com.eddie.budgeting.eddiesbudgetingapp.repository.ExpenseRepository;

import java.util.List;

public class ExpenseService {

    private final ExpenseRepository repo;

    public ExpenseService(ExpenseRepository repo) {
        this.repo = repo;
    }

    public List<Expense> findAll() {
        return repo.findAll();
    }

    public Expense findById(Long id) {
        return repo.findById(id).orElse(null);
    }

    public Expense createExpense(Expense newExpense) {
        newExpense.setExpenseId(null);
        repo.save(newExpense);
        return newExpense;
    }

    public Expense save(Expense expense) {
        return repo.save(expense);
    }

    public void delete(Long id) {
        repo.deleteById(id);

    }

    public Expense update(Long id, String updateChoice) {
        Expense budgetToUpdate = repo.findById(id).orElse(null);
        // Do logic to update it based on what they're trying to update.

        return null;
    }
}
