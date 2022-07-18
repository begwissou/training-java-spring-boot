package com.camara.demodatajpa.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties
public class ApplicationProperties {

  Integer bonus;
  String myProperty;
  Students students = new Students();

  public Integer getBonus() {
    return bonus;
  }

  public void setBonus(Integer bonus) {
    this.bonus = bonus;
  }

  public String getMyProperty() {
    return myProperty;
  }

  public void setMyProperty(String myProperty) {
    this.myProperty = myProperty;
  }

  public Students getStudents() {
    return students;
  }

  public void setStudents(Students students) {
    this.students = students;
  }

  public class Students {

    String noms;

    public String getNoms() {
      return noms;
    }

    public void setNoms(String noms) {
      this.noms = noms;
    }
  }
}
