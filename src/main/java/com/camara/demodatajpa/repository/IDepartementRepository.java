package com.camara.demodatajpa.repository;

import com.camara.demodatajpa.domain.Departement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Optional;
@RepositoryRestResource
public interface IDepartementRepository extends JpaRepository<Departement, Integer> {
    Optional<Departement> findOneByName(String name);
}
