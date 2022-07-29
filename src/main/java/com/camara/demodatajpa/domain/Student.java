package com.camara.demodatajpa.domain;

import com.camara.demodatajpa.domain.enumeration.Level;
import com.camara.demodatajpa.domain.enumeration.Sexe;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Student {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;

  @Column(nullable = false)
  private String name;

  private String firstName;

  private Level level;

  private Sexe sexe;
  @ManyToMany(
          fetch = FetchType.EAGER
  )

  @JoinTable(name = "cour_student")
  @JsonIgnoreProperties("students")
  private List<Cour> cours = new ArrayList<>();

  @ManyToOne()
  @JoinColumn(name = "departement_id")
  @JsonIgnoreProperties("students")
  private Departement departement;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<Cour> getCours() {
    return cours;
  }

  public void setCours(List<Cour> cours) {
    this.cours = cours;
  }

  public Departement getDepartement() {
    return departement;
  }

  public void setDepartement(Departement departement) {
    this.departement = departement;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public Level getLevel() {
    return level;
  }

  public void setLevel(Level level) {
    this.level = level;
  }

  public Sexe getSexe() {
    return sexe;
  }

  public void setSexe(Sexe sexe) {
    this.sexe = sexe;
  }
}
