package com.eddie.budgeting.eddiesbudgetingapp.service;

import com.eddie.budgeting.eddiesbudgetingapp.dto.BudgetResponse;
import com.eddie.budgeting.eddiesbudgetingapp.dto.BudgetUpdateRequest;
import com.eddie.budgeting.eddiesbudgetingapp.mapper.BudgetMapper;
import com.eddie.budgeting.eddiesbudgetingapp.model.Budget;
import com.eddie.budgeting.eddiesbudgetingapp.repository.BudgetRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BudgetService {

    private final BudgetRepository budgetRepo;

    public BudgetService(BudgetRepository budgetRepository) {
        this.budgetRepo = budgetRepository;
    }

    public List<Budget> findAll() {
        return budgetRepo.findAll();
    }

    public Budget findById(Long budgetId) {
        return budgetRepo.findById(budgetId).orElse(null);
    }

    public Budget createBudget(Budget newBudget) {
        newBudget.setBudgetId(null);
        budgetRepo.save(newBudget);
        return newBudget;
    }

    public Budget save(Budget Budget) {
        return budgetRepo.save(Budget);
    }

    public void delete(Long budgetId) {
        budgetRepo.deleteById(budgetId);
    }

    public BudgetResponse updateBudget(Long budgetId, BudgetUpdateRequest updateRequest) {
        // Find the budget to be updated.
        Budget budgetToUpdate = budgetRepo.findById(budgetId)
                .orElseThrow(() -> new RuntimeException("Budget not found!"));

        // Update the budget using the requested udpated we received.
        BudgetMapper.updateBudgetFromRequest(updateRequest, budgetToUpdate);

        // After updating the budget with the requested changes, we now map it to the Response DTO.
        BudgetResponse budgetResponse = BudgetMapper.mapResponse(budgetToUpdate);

        // Save the updates to the DB.
        budgetRepo.save(budgetToUpdate);

        return budgetResponse;
    }


}
