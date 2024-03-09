package com.petproject.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Book {

    @GeneratedValue
    @Id
    private Long id;

    @NotNull
    private String name;

    @NotNull
    private String author;


    @NotNull
    private int price;

    @Column(length = 150)
    @NotNull
    private String description;

    @NotNull
    private String publisher;

    @NotNull
    private List<String> availableLanguages;

}
