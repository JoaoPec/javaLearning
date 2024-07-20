package devdojo.poo.test;

import devdojo.poo.models.Student;

public class StudentTest {
    public static void main(String[] args) {

        Student student = new Student();

        student.age = 12;
        student.name = "Jhon";
        student.gender = 'M';

        System.out.println(student.name);
        System.out.println(student.gender);

    }
}
