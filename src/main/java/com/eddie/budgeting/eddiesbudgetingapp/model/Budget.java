package com.eddie.budgeting.eddiesbudgetingapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

@Entity
public class Budget {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    String budgetName;
    Map<String, BigDecimal> expenses = new HashMap<>();
    String expenseName;
    BigDecimal expenseCost;
    BigDecimal income;
    BigDecimal totalExpenses = BigDecimal.valueOf(0.0);

    public Budget() {



    }
}
