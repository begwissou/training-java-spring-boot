package com.camara.demodatajpa.services.impl;

import com.camara.demodatajpa.domain.Departement;
import com.camara.demodatajpa.repository.IDepartementRepository;
import com.camara.demodatajpa.services.IDepartementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartementServiceImpl implements IDepartementService {
    @Autowired
    private IDepartementRepository departementRepository;
    @Override
    public Departement save(Departement departement) {
        return departementRepository.save(departement);
    }

    @Override
    public Departement findOneByName(String name) {
        Optional< Departement > d = departementRepository.findOneByName(name);
        return d.isPresent() ? d.get() : null;
    }

    @Override
    public List<Departement> getAllDepartement() {
        return departementRepository.findAll();
    }
}
