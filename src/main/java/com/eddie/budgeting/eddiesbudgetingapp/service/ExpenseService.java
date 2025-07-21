package com.eddie.budgeting.eddiesbudgetingapp.service;

import com.eddie.budgeting.eddiesbudgetingapp.model.Budget;
import com.eddie.budgeting.eddiesbudgetingapp.model.Expense;
import com.eddie.budgeting.eddiesbudgetingapp.repository.BudgetRepository;
import com.eddie.budgeting.eddiesbudgetingapp.repository.ExpenseRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseService {

    private final ExpenseRepository repo;
    private final BudgetRepository budgetRepo;

    public ExpenseService(ExpenseRepository repo, BudgetRepository budgetRepo) {
        this.repo = repo;
        this.budgetRepo = budgetRepo;
    }

    public List<Expense> findAll(Long budgetId) {
        return repo.findByBudget_BudgetId(budgetId);
    }

    public Expense findById(Long id) {
        return repo.findById(id).orElse(null);
    }

    public Expense createExpense(Expense newExpense, Long budgetId) {
        newExpense.setExpenseId(null);

        // Add expense to budget. Throw an error if the budget does not exist!
        Budget assocBudget = budgetRepo.findById(budgetId)
                .orElseThrow(() -> new RuntimeException("Budget not found with id: " + budgetId));
        assocBudget.addExpense(newExpense);

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
        Expense expenseToUpdate = repo.findById(id).orElse(null);
        // Do logic to update it based on what they're trying to update.

        return null;
    }
}
