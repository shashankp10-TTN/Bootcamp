package com.bootcamp.restapi.entity;


import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
//@JsonIgnoreProperties("password")
@JsonFilter("dynamicFilter")
public class UserFilter {
    private Long id;
    private String name;
//    @JsonIgnore
    private String password;
    private Integer age;
}
