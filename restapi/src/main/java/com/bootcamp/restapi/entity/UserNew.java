package com.bootcamp.restapi.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


public class UserNew {
    private Name name;

    public UserNew(Name name) {
        this.name = name;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }
}
