package com.studentselection;

import java.util.Scanner;

public class StudentUtils {

    public static Student[] readStudentDetails(int numberOfStudents) {
        Student[] students = new Student[numberOfStudents];
        try (Scanner scanDetails = new Scanner(System.in)) {
            for (int i = 0; i < numberOfStudents; i++) {
                System.out.println("Enter the name of student " + (i + 1) + ": ");
                String name = scanDetails.nextLine();
                System.out.println("Enter the age of " + name + ": ");
                int age = scanDetails.nextInt();
                scanDetails.nextLine(); // Consume newline
                students[i] = new Student(name, age);
            }
        }
        return students;
    }

    public static void checkStudentAge(Student[] students) {
        for (Student student : students) {
            if (student.getAge() > 15) {
                System.out.println(student.getName() + " is old enough to receive a vaccine.");
            } else {
                System.out.println(student.getName() + " is not old enough to receive a vaccine.");
            }
        }
    }
}
