package com.camara.demodatajpa.repository;

import com.camara.demodatajpa.domain.Student;
import java.util.List;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface StudentRepository extends JpaRepository<Student, Integer> {
  Optional<Student> findOneByName(String name);

  // @Query(
  //   value = "SELECT * FROM Student s WHERE s.name LIKE %:term%",
  //   nativeQuery = true
  // ) //JPQL
  Page<Student> findAllByNameContaining(String termOrigin, Pageable pageable);
}
