package com.eddie.budgeting.eddiesbudgetingapp.controller;

import com.eddie.budgeting.eddiesbudgetingapp.dto.BudgetResponse;
import com.eddie.budgeting.eddiesbudgetingapp.dto.BudgetUpdateRequest;
import com.eddie.budgeting.eddiesbudgetingapp.model.Budget;
import com.eddie.budgeting.eddiesbudgetingapp.service.BudgetService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/budgets")
public class BudgetController {

    private final BudgetService budgetService;
    private List<Budget> budgetList = new ArrayList<>();

    public BudgetController(BudgetService budgetService) {
        this.budgetService = budgetService;
    }

    @GetMapping(produces = "application/json")
    public List<Budget> getAllBudgets() {
        return budgetService.findAll();
    }

    @PostMapping(produces = "application/json",
            consumes = "application/json")
    public Budget addBudget(@RequestBody Budget newBudget) {
        return budgetService.createBudget(newBudget);
    }

    @RequestMapping(path = "/{budgetId}", produces = "application/json")
    public Budget getBudget(@PathVariable Long budgetId) {
        return budgetService.findById(budgetId);
    }

    @PatchMapping("/{budgetId}")
    public ResponseEntity<BudgetResponse> editBudget(
            @PathVariable Long budgetId,
            @RequestBody BudgetUpdateRequest updateRequest
    ) {
        BudgetResponse response = budgetService.updateBudget(budgetId, updateRequest);
        return ResponseEntity.ok(response);
    }

    @DeleteMapping(path = "/{budgetId}", produces = "application/json")
    public void deleteBudget(@PathVariable Long budgetId) {
        budgetService.delete(budgetId);
    }



}
