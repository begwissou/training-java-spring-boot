package com.camara.demodatajpa.services;

import com.camara.demodatajpa.domain.Departement;

import java.util.List;

public interface IDepartementService {
    Departement save(Departement departement);
    Departement findOneByName (String name);

    List<Departement> getAllDepartement();
}
