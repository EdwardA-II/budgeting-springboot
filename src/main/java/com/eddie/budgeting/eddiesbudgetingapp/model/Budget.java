package com.eddie.budgeting.eddiesbudgetingapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Budget {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Getter
    @Setter
    String budgetName;

    @Transient
    Map<String, BigDecimal> expenses = new HashMap<>();

    String expenseName;
    BigDecimal expenseCost;
    BigDecimal income;
    BigDecimal totalExpenses = BigDecimal.valueOf(0.0);

}
