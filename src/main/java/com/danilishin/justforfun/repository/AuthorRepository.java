package com.danilishin.justforfun.repository;

import com.danilishin.justforfun.entity.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
