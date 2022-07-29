package com.camara.demodatajpa.rest;

import com.camara.demodatajpa.domain.Cour;
import com.camara.demodatajpa.services.ICourService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/courses")
public class CourResource {
    @Autowired
    private ICourService courService;
    @GetMapping("/list")
    private Page<Cour> getAllStudents(Pageable pageable)
    {
        return courService.getAllCours(pageable);
    }
}
