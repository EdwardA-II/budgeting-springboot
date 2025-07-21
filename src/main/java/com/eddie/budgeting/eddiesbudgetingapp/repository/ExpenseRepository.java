package com.eddie.budgeting.eddiesbudgetingapp.repository;

import com.eddie.budgeting.eddiesbudgetingapp.model.Expense;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseRepository extends JpaRepository<Expense, Long> {
}
