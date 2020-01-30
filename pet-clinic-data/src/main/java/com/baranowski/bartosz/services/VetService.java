package com.baranowski.bartosz.services;

import com.baranowski.bartosz.domain.Vet;

import java.util.Set;

public interface VetService {
    Vet findByLastName(String surname);

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();

}
