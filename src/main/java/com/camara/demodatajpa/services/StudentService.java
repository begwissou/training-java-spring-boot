package com.camara.demodatajpa.services;

import com.camara.demodatajpa.domain.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface StudentService {
  Student save(Student student);
  <T> Page<T> findAllProjectedBy(Pageable pageable, Class<T> t);
}
