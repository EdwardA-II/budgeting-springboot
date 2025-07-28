package com.eddie.budgeting.eddiesbudgetingapp.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class BudgetResponse {
    private Long budgetId;
    private String budgetName;
    private BigDecimal income;
    private BigDecimal plannedTotal;
    private BigDecimal actualTotal;

    // No expenses variable since I don't want to return the full list of expenses in the payload every time.
}
