package com.baranowski.bartosz.services.map;

import com.baranowski.bartosz.domain.Owner;
import com.baranowski.bartosz.services.CrudRepository;

import java.util.Set;

public class OwnerMapService extends AbstractMapService<Owner, Long>
    implements CrudRepository<Owner, Long> {

  @Override
  public Set<Owner> findAll() {
    return super.findAll();
  }

  @Override
  public void deleteById(Long id) {
    super.deleteById(id);
  }

  @Override
  public void delete(Owner owner) {
    super.delete(owner);
  }

  @Override
  public Owner save(Owner owner) {
    return super.save(owner.getId(), owner);
  }

  @Override
  public Owner findById(Long id) {
    return super.findById(id);
  }
}
