package com.bootcamp.assignment_3.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
/* Q3. a) Implement and demonstrate Single Table strategy.
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "pmode", discriminatorType = DiscriminatorType.STRING)
 */

/* Q2. c) Implement and demonstrate Table Per Class strategy.
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
 */

@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private double amount;
}
