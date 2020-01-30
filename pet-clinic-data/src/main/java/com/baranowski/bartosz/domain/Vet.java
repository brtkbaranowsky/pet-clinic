package com.baranowski.bartosz.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Vet extends Person {
    @Id
    Long id;
    String name;
    String surname;
    String address;
    LocalDate contractStart;
    LocalDate contractEnd;

}





















