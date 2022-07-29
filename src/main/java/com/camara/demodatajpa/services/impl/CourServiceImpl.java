package com.camara.demodatajpa.services.impl;

import com.camara.demodatajpa.domain.Cour;
import com.camara.demodatajpa.repository.ICourRepository;
import com.camara.demodatajpa.services.ICourService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourServiceImpl implements ICourService {
    @Autowired
    private ICourRepository courRepository;
    @Override
    public Cour save(Cour cour) {
        return courRepository.save(cour);
    }

    @Override
    public Cour findOneByName(String name) {
         Optional<Cour> s = courRepository.findOneByName(name);

        return s.isPresent() ? s.get() : null;
    }

    @Override
    public Page<Cour> getAllCours(Pageable pageable) {
        return courRepository.findAll(pageable);
    }

    @Override
    public List<Cour> getAllCours() {
        return courRepository.findAll();
    }
}
