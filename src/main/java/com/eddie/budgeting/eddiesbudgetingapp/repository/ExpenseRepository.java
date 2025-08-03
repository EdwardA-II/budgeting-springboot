package com.eddie.budgeting.eddiesbudgetingapp.repository;

import com.eddie.budgeting.eddiesbudgetingapp.model.Expense;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigDecimal;
import java.util.List;

public interface ExpenseRepository extends JpaRepository<Expense, Long> {

    // Find all expenses for a given budget
    List<Expense> findByBudget_BudgetId(Long budgetId);

    // Check if the Expense is a duplicate based on the name, cost, and associated budget ID.
    boolean existsByExpenseNameAndExpenseCostAndBudget_BudgetId(String expenseName, BigDecimal expenseCost, Long budgetId);
}
