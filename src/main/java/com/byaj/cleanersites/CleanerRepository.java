package com.byaj.cleanersites;

import org.springframework.data.repository.CrudRepository;

public interface CleanerRepository extends CrudRepository<Cleaner, Long> {
  Cleaner findBySlug(String slug);
}
