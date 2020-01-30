package com.baranowski.bartosz.services.map;

import com.baranowski.bartosz.domain.Vet;
import com.baranowski.bartosz.services.CrudRepository;

import java.util.Set;

public class VetMapService extends AbstractMapService<Vet, Long>
    implements CrudRepository<Vet, Long> {
  @Override
  public Set<Vet> findAll() {
    return super.findAll();
  }

  @Override
  public void deleteById(Long id) {
    super.deleteById(id);
  }

  @Override
  public void delete(Vet vet) {
    super.delete(vet);
  }

  @Override
  public Vet save(Vet vet) {
    return super.save(vet.getId(), vet);
  }

  @Override
  public Vet findById(Long id) {
    return super.findById(id);
  }
}
