package com.eddie.budgeting.eddiesbudgetingapp.service;

import com.eddie.budgeting.eddiesbudgetingapp.dto.ExpenseResponse;
import com.eddie.budgeting.eddiesbudgetingapp.model.Budget;
import com.eddie.budgeting.eddiesbudgetingapp.model.Expense;
import com.eddie.budgeting.eddiesbudgetingapp.repository.BudgetRepository;
import com.eddie.budgeting.eddiesbudgetingapp.repository.ExpenseRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseService {

    private final ExpenseRepository expenseRepository;
    private final BudgetRepository budgetRepo;

    public ExpenseService(ExpenseRepository expenseRepository, BudgetRepository budgetRepo) {
        this.expenseRepository = expenseRepository;
        this.budgetRepo = budgetRepo;
    }

    public List<Expense> findAll(Long budgetId) {
        return expenseRepository.findByBudget_BudgetId(budgetId);
    }

    public Expense findById(Long id) {
        return expenseRepository.findById(id).orElse(null);
    }

    public ExpenseResponse createExpense(Expense newExpense, Long budgetId) {
        newExpense.setExpenseId(null);

        // Find the budget the expense will be added to.
        Budget assocBudget = budgetRepo.findById(budgetId)
                .orElseThrow(() -> new RuntimeException("Budget not found with id: " + budgetId));

        // Check if this expense is already in the budget we are referring to.
        if (expenseRepository.existsByExpenseNameAndExpenseCostAndBudget_BudgetId(
                newExpense.getExpenseName(),
                newExpense.getExpenseCost(),
                assocBudget.getBudgetId())) {

            throw new IllegalArgumentException("Duplicate expense found.");
        }
        else {
            assocBudget.addExpense(newExpense);
        }

        expenseRepository.save(newExpense);
        ExpenseResponse expenseResponse = new ExpenseResponse(newExpense);

        return expenseResponse;
    }

    public Expense save(Expense expense) {
        return expenseRepository.save(expense);
    }

    public void delete(Long id) {
        expenseRepository.deleteById(id);

    }

    public Expense update(Long id, String updateChoice) {
        Expense expenseToUpdate = expenseRepository.findById(id).orElse(null);
        // Do logic to update it based on what they're trying to update.

        return null;
    }
}
