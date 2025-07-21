package com.eddie.budgeting.eddiesbudgetingapp.controller;

import com.eddie.budgeting.eddiesbudgetingapp.model.Budget;
import com.eddie.budgeting.eddiesbudgetingapp.model.Expense;
import com.eddie.budgeting.eddiesbudgetingapp.service.ExpenseService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/budgets/{budgetId}/expenses")
public class ExpenseController {

    private final ExpenseService expenseService;

    public ExpenseController(ExpenseService expenseService) {
        this.expenseService = expenseService;
    }

    @GetMapping(produces = "application/json")
    public List<Expense> getAllExpense() {
        return expenseService.findAll();
    }

    @PostMapping(produces = "application/json",
            consumes = "application/json")
    public Expense addExpense(@RequestBody Expense newExpense) {
        return expenseService.createExpense(newExpense);
    }

    @RequestMapping(path = "/{expenseId}", produces = "application/json")
    public Expense getExpense(@PathVariable Long expenseId) {
        return expenseService.findById(expenseId);
    }

    @PutMapping(path = "/{expenseId}", produces = "application/json")
    public void editExpense(@PathVariable Long expenseId) {

    }

    @DeleteMapping(path = "/{expenseId}", produces = "application/json")
    public void deleteExpense(@PathVariable Long expenseId) {
        expenseService.delete(expenseId);
        }
}
