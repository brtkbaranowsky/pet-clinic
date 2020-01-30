package com.baranowski.bartosz.domain;

import lombok.Getter;

import java.time.LocalDate;

@Getter
public class Pet extends BaseEntity {
    private PetType petType;
    private Owner owner;
    private LocalDate birthDate;


    public Pet(Long id, PetType petType, Owner owner, LocalDate birthDate) {
        super(id);
        this.petType = petType;
        this.owner = owner;
        this.birthDate = birthDate;
    }
}
