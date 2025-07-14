package com.eddie.budgeting.eddiesbudgetingapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BudgetController {

    @RequestMapping("/")
    public String root() {

        return "index.html";
    }
}
