package com.byaj.cleanersites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;

@Entity
public class Cleaner {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  Long id;
  String name;
  String hours;
  String message;

  @Size(max =2000)
  String description;
  String slug;
  String theme;

  public Cleaner() {
  }

  public Cleaner(String name, String hours, String message, String description, String slug, String theme) {
    this.name = name;
    this.hours = hours;
    this.message = message;
    this.description = description;
    this.slug = slug;
    this.theme = theme;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getHours() {
    return hours;
  }

  public void setHours(String hours) {
    this.hours = hours;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getSlug() {
    return slug;
  }

  public void setSlug(String slug) {
    this.slug = slug;
  }

  public String getTheme() {
    return theme;
  }

  public void setTheme(String theme) {
    this.theme = theme;
  }
}
