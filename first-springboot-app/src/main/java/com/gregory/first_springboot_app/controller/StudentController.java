package com.gregory.first_springboot_app.controller;

import java.util.ArrayList;

import org.apache.catalina.connector.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gregory.first_springboot_app.model.Student;

@RestController
@RequestMapping("/students")
public class StudentController {

    ArrayList<Student> studentList = new ArrayList<Student>();

    // have to add url search parameter with the name of 'nameOfStudent'
    @GetMapping
    public ResponseEntity<Student> getStudent(@RequestParam(defaultValue = "", required = true) String nameOfStudent) {

        // Make the student list (its empty for now)

        // Add new students to the empty list
        studentList.add(new Student("lester", "10208233", 3.40));
        studentList.add(new Student("tim", "10302123", 2.50));
        studentList.add(new Student("john", "10208233", 3.00));
        studentList.add(new Student("greg", "10208234", 3.45));

        // now that list is not empty, we go through the whole list of students
        for (Student student : studentList) {
            // if we found the student, we reply the HTTP request
            if (nameOfStudent.equals(student.getName())) {
                // return the student object (or class) - return will stop the entire code from
                // going any further
                return ResponseEntity.ok(student);
            }

        }
        // if it reached here, we reply to the http request with "no content"

        for (int i = 0; i < studentList.size(); i++) {
            System.out.println(studentList.get(0));
        }

        return ResponseEntity.status(500).body(null);
    }

    @PostMapping
    public ResponseEntity<String> addStudent() {

        return ResponseEntity.status(500).body("error occured");
    }

}
