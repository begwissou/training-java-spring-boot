package com.camara.demodatajpa.services;

import com.camara.demodatajpa.domain.Cour;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ICourService {
    Cour save(Cour cour);
    Cour findOneByName (String name);
    Page<Cour> getAllCours(Pageable pageable);
    List<Cour> getAllCours();
}
