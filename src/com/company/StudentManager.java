package com.company;

public class StudentManager extends UserManager {

    public void addStudent(Student student){
        System.out.println("id: " + student.getId() + " Added to " + student.getClass_() + " class");
    }

}
