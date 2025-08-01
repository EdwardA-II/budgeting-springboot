package com.eddie.budgeting.eddiesbudgetingapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Data
@NoArgsConstructor
public class Expense {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long expenseId;

    @ManyToOne
    @JoinColumn(name = "budgetId")
    private Budget budget;

    String expenseName;
    BigDecimal expenseCost;
    BigDecimal totalExpenses = BigDecimal.valueOf(0.0);

    @Override
    public boolean equals(Object e) {
        // Check if the objects are the same. If yes, then they are a match.
        if (this == e ) {
            return true;
        }

        // Check if its null. If yes, then it canNOT be a match.
        if (e == null) {
            return false;
        }

        if (this.getClass() != e.getClass()) {
            return false;
        }

        Expense expense = (Expense) e;

        return Objects.equals(this.expenseName, expense.expenseName) &&
                Objects.equals(this.expenseId, expense.expenseId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(expenseName, expenseId);
    }

}
