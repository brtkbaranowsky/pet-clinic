package com.baranowski.bartosz.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
public abstract class Person extends BaseEntity {
    public Person(Long id, String firstName, String surname) {
        super(id);
        this.firstName = firstName;
        this.surname = surname;
    }

    private String firstName;
    private String surname;


}
