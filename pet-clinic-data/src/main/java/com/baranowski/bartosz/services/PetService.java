package com.baranowski.bartosz.services;

import com.baranowski.bartosz.domain.Pet;

import java.util.Set;

public interface PetService {
  Pet findById(Long id);

  Pet save(Pet pet);

  Set<Pet> findAll();
}
