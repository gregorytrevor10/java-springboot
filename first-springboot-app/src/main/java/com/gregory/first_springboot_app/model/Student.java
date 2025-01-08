package com.gregory.first_springboot_app.model;


public class Student {

    // Instance variables
    private String name;
    private String studentId;
    private double gpa;
    
    public Student(String name, String studentId, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.gpa = gpa;
    }

    // Accessor methods
    public String getName() {
        return name;
    }

    public String getSSN() {
        return studentId;
    }

    public double getGPA() {
        return gpa;
    }

    // Mutator methods
    public void setName(String newName) {
        this.name = newName;
    }

    public void setSSN(String newSSN) {
        this.studentId = newSSN;
    }

    public void setGPA(double newGPA) {
        if (newGPA >= 0 && newGPA <= 4.0) {
            this.gpa = newGPA;
        } else {
            System.out.println("Invalid GPA. Setting to default value.");
            this.gpa = 0.0;
        }
    }

    // toString method
    @Override
    public String toString() {
        return "Name: " + name + ", Student-ID: " + studentId + ", GPA: " + gpa;
    }

    // equals method
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student) {
            Student otherStudent = (Student) obj;
            return this.name.equals(otherStudent.getName())
                    && this.studentId.equals(otherStudent.getSSN())
                    && Double.compare(this.gpa, otherStudent.getGPA()) == 0;
        }
        return false;
    }
}
