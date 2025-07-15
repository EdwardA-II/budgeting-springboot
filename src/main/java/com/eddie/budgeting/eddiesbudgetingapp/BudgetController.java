package com.eddie.budgeting.eddiesbudgetingapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BudgetController {

    @RequestMapping("/")
    public String root() {

        return "index";
    }

    @GetMapping("/budgets/{budget_id}")
    public Budget addBudget(@PathVariable long budgetID) {

        return null;
    }

    @RequestMapping("/budgets/{budget_id}")
    public Budget getBudget() {

        return null;
    }

    @PostMapping("/budgets/{budget_id}")
    public String addBudget() {

        return "index";
    }
}
