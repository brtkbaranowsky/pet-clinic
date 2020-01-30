package com.baranowski.bartosz.services;

import com.baranowski.bartosz.domain.Owner;

public interface OwnerService extends CrudRepository<Owner, Long> {
  Owner findByLastName(String surname);
}
