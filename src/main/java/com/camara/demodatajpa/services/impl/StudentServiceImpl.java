package com.camara.demodatajpa.services.impl;

import com.camara.demodatajpa.domain.Student;
import com.camara.demodatajpa.repository.StudentRepository;
import com.camara.demodatajpa.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

  // @Value("${my-property}")
  @Autowired
  StudentRepository studentRepository;

  @Override
  public Student save(Student student) {
    return studentRepository.save(student);
  }
}
