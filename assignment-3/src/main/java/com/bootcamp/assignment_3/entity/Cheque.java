package com.bootcamp.assignment_3.entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
//@DiscriminatorValue("ch")
@PrimaryKeyJoinColumn(name = "id")
public class Cheque extends Payment {
    private String chequeNumber;
}
