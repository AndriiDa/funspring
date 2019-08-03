package com.danilishin.justforfun.entity;

import java.util.HashSet;
import java.util.Set;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Author {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  private String firstName;
  private String lastName;

  @ManyToMany(mappedBy = "authors")
  private Set<Book> books = new HashSet<>();

  public Author() {
  }


}
