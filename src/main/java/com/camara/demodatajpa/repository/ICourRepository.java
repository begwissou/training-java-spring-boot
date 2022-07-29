package com.camara.demodatajpa.repository;

import com.camara.demodatajpa.domain.Cour;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Optional;
@RepositoryRestResource
public interface ICourRepository extends JpaRepository<Cour, Integer> {
    Optional<Cour> findOneByName(String name);
}
