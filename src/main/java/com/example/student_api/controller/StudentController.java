package com.example.student_api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {

    @GetMapping("/text")
    public String getText() {
        return "Студенческий билет: 1bac24020";
    }

    @GetMapping("/numbers")
    public List<Integer> getNumbers() {
        return List.of(1, 2, 4, 0, 2, 0);
    }
}