package com.eddie.budgeting.eddiesbudgetingapp.controller;

import com.eddie.budgeting.eddiesbudgetingapp.model.Budget;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/budgets")
public class BudgetController {

    // Apparently, I dont need to define a root point. Spring Boot will automatically choose index.html for me!
/*
    @RequestMapping("/")
//    public String root() {
//
//        return "index";
    }
*/

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
