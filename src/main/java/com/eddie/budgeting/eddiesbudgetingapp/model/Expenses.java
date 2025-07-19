package com.eddie.budgeting.eddiesbudgetingapp.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

@Data
@NoArgsConstructor
public class Expenses {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Transient
    Map<String, BigDecimal> expenses = new HashMap<>();
    String expenseName;
    BigDecimal expenseCost;
    BigDecimal income;
    BigDecimal totalExpenses = BigDecimal.valueOf(0.0);

}
