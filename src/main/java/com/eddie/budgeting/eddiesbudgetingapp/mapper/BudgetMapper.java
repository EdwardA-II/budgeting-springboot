package com.eddie.budgeting.eddiesbudgetingapp.mapper;

import com.eddie.budgeting.eddiesbudgetingapp.dto.BudgetResponse;
import com.eddie.budgeting.eddiesbudgetingapp.dto.BudgetUpdateRequest;
import com.eddie.budgeting.eddiesbudgetingapp.model.Budget;

public class BudgetMapper {

    public static BudgetResponse mapResponse(Budget budgetToUpdate) {
        BudgetResponse budgetResponse = new BudgetResponse();
        budgetResponse.setBudgetId(budgetToUpdate.getBudgetId());
        budgetResponse.setBudgetName(budgetToUpdate.getBudgetName());
        budgetResponse.setIncome(budgetToUpdate.getIncome());
        budgetResponse.setPlannedTotal(budgetToUpdate.getPlannedTotal());
        budgetResponse.setActualTotal(budgetToUpdate.getActualTotal());

        return budgetResponse;
    }

    public static void updateBudgetFromRequest(BudgetUpdateRequest updateRequest, Budget budgetToUpdate) {

        // Updates the values with the requested updates if they opt to do so.

        // If the incoming request has a name, the existing budget's name will be changed.
        if (updateRequest.getBudgetName() != null) {

            // Set it to the incoming budget data's name.
            budgetToUpdate.setBudgetName(updateRequest.getBudgetName());
        }

        if (updateRequest.getIncome() != null) {
            budgetToUpdate.setIncome(updateRequest.getIncome());
        }

        if (updateRequest.getPlannedTotal() != null) {
            budgetToUpdate.setPlannedTotal(updateRequest.getPlannedTotal());
        }

        if (updateRequest.getActualTotal() != null) {
            budgetToUpdate.setActualTotal(updateRequest.getActualTotal());
        }
    }

}
