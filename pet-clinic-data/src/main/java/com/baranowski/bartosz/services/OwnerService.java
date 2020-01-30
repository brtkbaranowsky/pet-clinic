package com.baranowski.bartosz.services;

import com.baranowski.bartosz.domain.Owner;

import java.util.Set;

public interface OwnerService {
    Owner findByLastName(String surname);

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();
}
