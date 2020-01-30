package com.baranowski.bartosz.services;

import java.util.Set;

public interface CrudRepository<T, ID> {
  Set<T> findAll();

  T findById(ID id);

  T save (T object);

  void delete (T object);

  void deleteById (ID id);
}
