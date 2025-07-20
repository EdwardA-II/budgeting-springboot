package com.eddie.budgeting.eddiesbudgetingapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import jakarta.persistence.CascadeType;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Budget {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long budgetId;

    String budgetName;
    BigDecimal income;
    BigDecimal plannedTotal;
    BigDecimal actualTotal;

    @OneToMany(mappedBy = "budget", cascade = CascadeType.ALL, orphanRemoval = false)
    List<Expense> expenses = new ArrayList<>();


    public void renameBudget(String newName) {
        this.budgetName = newName;
    }

    public void addExpense(Expense expense) {
        this.expenses.add(expense);
    }

    public void removeExpense(Expense expenseToRemove) {
        this.expenses.remove(expenseToRemove);
    }
}

