package com.eddie.budgeting.eddiesbudgetingapp.controller;

import com.eddie.budgeting.eddiesbudgetingapp.model.Budget;
import com.eddie.budgeting.eddiesbudgetingapp.service.BudgetService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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

    @PostMapping(path = "/{budgetId}", produces = "application/json",
        consumes = "application/json")
    public Budget addBudget(@PathVariable Budget newBudget) {
        return budgetService.save(newBudget);
    }

    @RequestMapping("/{budgetId}")
    public Budget getBudget(@PathVariable Long budgetId) {
        return budgetService.findById(budgetId);
    }

    @PutMapping("/budgets/{budgetId}")
    public void editBudget(@PathVariable Long budgetId) {

    }

    @DeleteMapping("/budgets/{budgetId}")
    public void deleteBudget(@PathVariable Long budgetId) {
        budgetService.delete(budgetId);
    }

}
