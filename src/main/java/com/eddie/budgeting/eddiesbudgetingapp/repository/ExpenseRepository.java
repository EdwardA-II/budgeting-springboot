package com.eddie.budgeting.eddiesbudgetingapp.repository;

import com.eddie.budgeting.eddiesbudgetingapp.model.Expense;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ExpenseRepository extends JpaRepository<Expense, Long> {

    // Find all expenses for a given budget
    List<Expense> findByBudget_BudgetId(Long budgetId);
}
