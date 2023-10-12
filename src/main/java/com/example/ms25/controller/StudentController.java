package com.example.ms25.controller;


import com.example.ms25.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
    @RestController
    @RequiredArgsConstructor
    @ComponentScan("com.example.ms25.service")
    @Component
    public class StudentController {

        private final StudentService studentService;

        @GetMapping("/students")
        public String getStudents(
                @RequestParam(name = "firstName") String firstName,
                @RequestParam(name = "lastName") String lastName,
                @RequestParam(name = "age") Integer age) {

            return studentService.params(firstName, lastName, age);
        }
    }
