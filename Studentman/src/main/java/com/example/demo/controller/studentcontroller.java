package com.example.demo.controller;

import com.example.demo.Entity.Student123;
import com.example.demo.Service.Studentser;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/students")
@CrossOrigin("*")
public class studentcontroller {

    @Autowired
    private Studentser service;

    @PostMapping
    public Student123 addStudent(@Valid @RequestBody Student123 student) {
        return service.addStudent(student);
    }

    @GetMapping
    public List<Student123> getStudents() {
        return service.getStudents();
    }

    @PutMapping("/{id}")
    public Student123 updateStudent(@PathVariable Long id,
                                    @Valid @RequestBody Student123 student) {
        return service.updateStudent(id, student);
    }

    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable Long id) {
        return service.deleteStudent(id);
    }
}
