package de.telran.baibak.iryna.cw1;

import de.telran.baibak.iryna.cw1.Student;

import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        Student studentOne;
        studentOne = new Student("John", 18);
        Student studentTwo = new Student(1);
        Scanner scanner = new Scanner(System.in);
        int age = studentOne.getAge();
        age += 100;




        studentOne.sayHello();
        studentTwo.sayHello();
        System.out.println(Student.TYPE);
        System.out.println(studentOne.getAge());

    }
}
