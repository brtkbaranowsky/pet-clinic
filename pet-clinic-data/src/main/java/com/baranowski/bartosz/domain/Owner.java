package com.baranowski.bartosz.domain;

import lombok.Getter;

@Getter
public class Owner extends Person {

  public Owner(Long id, String firstName, String surname) {
    super(id, firstName, surname);
  }
}
