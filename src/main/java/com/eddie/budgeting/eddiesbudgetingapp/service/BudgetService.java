package com.eddie.budgeting.eddiesbudgetingapp.service;

import com.eddie.budgeting.eddiesbudgetingapp.model.Budget;
import com.eddie.budgeting.eddiesbudgetingapp.repository.BudgetRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

@Service
public class BudgetService {

    private final BudgetRepository repo;

    public BudgetService(BudgetRepository repo) {
        this.repo = repo;
    }

    public List<Budget> findAll() {
        return repo.findAll();
    }

    public Budget findById(Long id) {
        return repo.findById(id).orElse(null);
    }

    /* OLD createBudget method that apparently would not work.
    public Budget createBudget (Long id,
                                String budgetName,
                                Map<String, BigDecimal> expenses,
                                String expenseName,
                                BigDecimal income,
                                BigDecimal totalExpenses) {
        Budget newBudget = new Budget();
        newBudget.setId(id);
        newBudget.setBudgetName(budgetName);
        newBudget.setExpenses(expenses);
        newBudget.setExpenseName(expenseName);
        newBudget.setIncome(income);
        newBudget.setTotalExpenses(totalExpenses);
        return newBudget;
    }
    */

    public Budget createBudget(Budget newBudget) {
        newBudget.setId(null);
        repo.save(newBudget);
        return newBudget;
    }

    // TODO: Hmm. How do I differentiate between saving a budget as a bew one vs saving edits to a pre-existing budget. Hmmm...
    public Budget save(Budget Budget) {
        return repo.save(Budget);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }

    public Budget update(Long id, String updateChoice) {
//        Budget budgetToUpdate = repo.findById(id).orElse(null);
//        updateChoice += updateChoice.equalsIgnoreCase();
//        switch (updateChoice):
//            case updateChoice.equalsIgnoreCase("")-> {""}

        return null;
    }


}
