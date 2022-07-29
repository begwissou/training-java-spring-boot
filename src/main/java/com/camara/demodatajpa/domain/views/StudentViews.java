package com.camara.demodatajpa.domain.views;

import com.camara.demodatajpa.domain.Cour;
import com.camara.demodatajpa.domain.Departement;
import com.camara.demodatajpa.domain.Student;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection( name = "studentsViews", types = {Student.class})
public interface StudentViews {
    String getName();

    @JsonIgnoreProperties("students")
    List<Cour> getCours();

    @JsonIgnoreProperties("students")
    Departement getDepartement();

    Integer getId();
}
