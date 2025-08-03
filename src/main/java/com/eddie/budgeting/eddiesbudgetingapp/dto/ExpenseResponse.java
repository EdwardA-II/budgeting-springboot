package com.eddie.budgeting.eddiesbudgetingapp.dto;

import com.eddie.budgeting.eddiesbudgetingapp.model.Expense;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class ExpenseResponse {

    private String expenseName;
    private BigDecimal expenseCost;
    private Long budgetId;

    // TODO: Temporary mini-mapper inside the ExpenseResponse DTO so I dont have to make a mapper class right now.
    public ExpenseResponse(Expense expense) {
        this.expenseName = expense.getExpenseName();
        this.expenseCost = expense.getExpenseCost();
        this.budgetId = expense.getBudget().getBudgetId();
    }

}
