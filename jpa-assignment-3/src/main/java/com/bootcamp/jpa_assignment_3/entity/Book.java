package com.bootcamp.jpa_assignment_3.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Getter
@Setter
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String bookName;
//    @OneToOne
//    @JoinColumn(name = "author_id")
//    @ManyToOne
//    @JoinColumn(name = "author_id")

    @ManyToMany(mappedBy = "book")
    private Set<Author> author;

}
