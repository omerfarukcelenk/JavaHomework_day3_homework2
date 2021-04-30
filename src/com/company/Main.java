package com.company;

public class Main {

    public static void main(String[] args) {

    User user1 = new User();
    user1.setFirstName("Ömer Faruk");
    user1.setLastName("Çelenk");
    user1.setId(1);

    Student  student = new Student();
    student.setFirstName("Melih");
    student.setLastName("Gündoğan");
    student.setClass_(12);
    student.setId(2);

    Instructor instructor = new Instructor();
    instructor.setFirstName("Mustafa");
    instructor.setLastName("Işık");
    instructor.setBranch("biology");
    instructor.setId(3);

    UserManager userManager = new UserManager();
    userManager.add(user1);
    userManager.add(student);
    userManager.add(instructor);

    User[] users = {user1, student, instructor};
    userManager.addMultiple(users);

    StudentManager studentManager = new StudentManager();

    studentManager.addStudent(student);

    InstructorManager instructorManager = new InstructorManager();
    instructorManager.addInstructor(instructor);

    }
}
