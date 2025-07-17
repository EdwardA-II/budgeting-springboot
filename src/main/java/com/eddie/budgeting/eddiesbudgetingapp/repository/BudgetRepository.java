package com.eddie.budgeting.eddiesbudgetingapp.repository;

import com.eddie.budgeting.eddiesbudgetingapp.model.Budget;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BudgetRepository extends JpaRepository<Budget, Long> {


}
