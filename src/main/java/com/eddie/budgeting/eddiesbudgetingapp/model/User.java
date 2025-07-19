package com.eddie.budgeting.eddiesbudgetingapp.model;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class User {
    String firstName;
    String lastName;
    String email;



}
