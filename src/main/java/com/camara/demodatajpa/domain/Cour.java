package com.camara.demodatajpa.domain;

import org.hibernate.annotations.ManyToAny;
import org.hibernate.annotations.ValueGenerationType;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Cour {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;

    @ManyToMany()
    private List<Student> students = new ArrayList<>();

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

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
