package com.bootcamp.assignment_3.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
//@DiscriminatorValue("cc")
@PrimaryKeyJoinColumn(name = "id")
public class CreditCard extends Payment{
    private String creditcardNumber;
}
