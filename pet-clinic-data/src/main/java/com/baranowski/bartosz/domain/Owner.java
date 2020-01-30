package com.baranowski.bartosz.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Owner extends Person {

    private String firstName;
    private String lastName;
}
