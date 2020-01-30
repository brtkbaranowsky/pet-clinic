package com.baranowski.bartosz.services.map;

import com.baranowski.bartosz.domain.Pet;
import com.baranowski.bartosz.services.CrudRepository;

import java.util.Set;

public class PetMapService extends AbstractMapService<Pet, Long>
    implements CrudRepository<Pet, Long> {
  @Override
  public Set<Pet> findAll() {
    return super.findAll();
  }

  @Override
  public void deleteById(Long id) {
    super.deleteById(id);
  }

  @Override
  public void delete(Pet pet) {
    super.delete(pet);
  }

  @Override
  public Pet save(Pet pet) {
    return super.save(pet.getId(), pet);
  }

  @Override
  public Pet findById(Long id) {
    return super.findById(id);
  }
}
