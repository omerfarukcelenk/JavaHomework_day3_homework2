package com.company;

public class InstructorManager {

    public void addInstructor(Instructor instructor){
        System.out.println("id: " +  instructor.getId()+ "  added to this branch => " + instructor.getBranch());
    }

}
