package com.camara.demodatajpa.rest;

import com.camara.demodatajpa.config.ApplicationProperties;
import com.camara.demodatajpa.domain.Student;
import com.camara.demodatajpa.repository.StudentRepository;
import com.camara.demodatajpa.services.StudentService;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/students")
public class StudentResource {

  @Value("${bonus}")
  String bonusLocal;

  @Value("${my-property}")
  String myProperty;

  @Value("${students.noms}")
  String studentsNames;

  @Autowired
  StudentRepository studentRepository;

  @Autowired
  ApplicationProperties applicationProperties;

  private final StudentService studentService;

  public StudentResource(StudentService studentService) {
    this.studentService = studentService;
  }

  @PostMapping("/save")
  public Student addStudent(@RequestBody Student student) {
    return studentService.save(student);
  }

  @GetMapping("/search-one-by-name")
  public Student searchOneByName(@RequestParam String name) {
    Optional<Student> s = studentRepository.findOneByName(name);
    return s.isPresent() ? s.get() : null;
  }

  @GetMapping("/list")
  public Page<Student> findAll(Pageable pageable) {
    return studentRepository.findAll(pageable);
  }

  @GetMapping("/search")
  public Page<Student> searchStudent(String term, Pageable pageable) {
    return studentRepository.findAllByNameContaining(term, pageable);
  }

  @GetMapping("/bonus")
  public String getBonus() {
    return (
      applicationProperties.getBonus() +
      " " +
      applicationProperties.getMyProperty() +
      " " +
      applicationProperties.getStudents().getNoms()
    );
  }
}
