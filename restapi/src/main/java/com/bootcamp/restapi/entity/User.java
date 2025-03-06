package com.bootcamp.restapi.entity;

import lombok.*;
import org.springframework.web.bind.annotation.GetMapping;

@Getter
//@Setter
@AllArgsConstructor
//@NoArgsConstructor
public class User {
    private String name;
}
