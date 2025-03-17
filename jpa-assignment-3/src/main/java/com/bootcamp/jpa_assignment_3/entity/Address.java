package com.bootcamp.jpa_assignment_3.entity;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Embeddable
@Getter
@Setter
public class Address {
    private String StreetNumber;
    private String location;
    private String state;

}
