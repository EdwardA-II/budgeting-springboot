package com.eddie.budgeting.eddiesbudgetingapp.controller;

import com.eddie.budgeting.eddiesbudgetingapp.model.Budget;
import com.eddie.budgeting.eddiesbudgetingapp.service.BudgetService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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

    /* OLD addBudget endpoint!
    @PostMapping(produces = "application/json",
        consumes = "application/json")
    public Budget addBudget(@RequestBody Long id,
                            String budgetName,
                            Map<String, BigDecimal> expenses,
                            String expenseName,
                            BigDecimal income,
                            BigDecimal totalExpenses) {
        return budgetService.createBudget(id, budgetName, expenses, expenseName, income, totalExpenses);
    }
     */

    @PostMapping(produces = "application/json",
            consumes = "application/json")
    public Budget addBudget(@RequestBody Budget newBudget) {
        return budgetService.createBudget(newBudget);
    }

    @RequestMapping(path = "/{budgetId}", produces = "application/json")
    public Budget getBudget(@PathVariable Long budgetId) {
        return budgetService.findById(budgetId);
    }

    @PutMapping(path = "/{budgetId}", produces = "application/json")
    public void editBudget(@PathVariable Long budgetId) {

    }

    @DeleteMapping(path = "/{budgetId}", produces = "application/json")
    public void deleteBudget(@PathVariable Long budgetId) {
        budgetService.delete(budgetId);
    }

}
