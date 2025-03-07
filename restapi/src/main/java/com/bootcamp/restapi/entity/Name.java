package com.bootcamp.restapi.entity;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Name {
    @Size(min=2, message = "firstName cannot be less than 2")
    @NotBlank(message = "firstName cannot be empty")
    private String firstName;

    @NotBlank(message = "lastName cannot be empty")
    private String lastName;
}
