package com.bootcamp.jpa_assignment_3.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    @Embedded
    private Address address;

    private List<String> subjects;
//    @OneToOne(mappedBy = "author", cascade = CascadeType.ALL)
//      private Book book;

//    @OneToMany(mappedBy = "author", cascade = CascadeType.ALL)
//    private Set<Book> book;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "book_author",
            joinColumns = @JoinColumn(name = "author_id"),
            inverseJoinColumns = @JoinColumn(name = "book_id")
    )
    private Set<Book> book;
}
