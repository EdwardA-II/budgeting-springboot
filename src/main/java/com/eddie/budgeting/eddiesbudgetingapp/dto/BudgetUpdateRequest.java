package com.eddie.budgeting.eddiesbudgetingapp.dto;

import com.eddie.budgeting.eddiesbudgetingapp.model.Expense;
import jakarta.persistence.CascadeType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class BudgetUpdateRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long budgetId;

    String budgetName;
    BigDecimal income;
    BigDecimal plannedTotal;
    BigDecimal actualTotal;

    @OneToMany(mappedBy = "budget", cascade = CascadeType.ALL, orphanRemoval = false)
    List<Expense> expenses = new ArrayList<>();
}
