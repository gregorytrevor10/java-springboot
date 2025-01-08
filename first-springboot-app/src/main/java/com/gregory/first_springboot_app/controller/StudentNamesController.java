package com.gregory.first_springboot_app.controller;

import java.util.ArrayList;

import org.apache.catalina.connector.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gregory.first_springboot_app.model.Student;

@RestController
@RequestMapping("/student-names")
public class StudentNamesController {

    @GetMapping
    public ResponseEntity<Student> getStudent(@RequestParam(defaultValue = "", required = false) String nameOfStudent) {

        ArrayList<Student> studentList = new ArrayList<Student>();

        studentList.add(new Student("lester", "10208233", 3.40));
        studentList.add(new Student("greg", "10208234", 3.45));

        for (Student student : studentList) {
            if (nameOfStudent.equals(student.getName())) {
                return ResponseEntity.ok(student);
            }

        }
        return ResponseEntity.noContent().build();
    }

}
