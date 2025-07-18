package com.eddie.budgeting.eddiesbudgetingapp.service;

import com.eddie.budgeting.eddiesbudgetingapp.model.Budget;
import com.eddie.budgeting.eddiesbudgetingapp.repository.BudgetRepository;
import org.springframework.stereotype.Service;

import java.util.List;

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
