package com.eddie.budgeting.eddiesbudgetingapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Budget {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    String budgetName;
    List<Expenses> expenses = new ArrayList<>();

    public void addExpense(Expenses expense) {
        this.expenses.add(expense);
    }

    public void renameBudget(String newName) {
        this.budgetName = newName;
    }
}

