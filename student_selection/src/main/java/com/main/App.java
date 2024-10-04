package com.main;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        System.out.println("Enter the number of students: ");
        try (Scanner scanner = new Scanner(System.in)) {
            int numberOfStudents = scanner.nextInt();
            Student[] students = new Student[numberOfStudents];
            Scanner scanDetails = new Scanner(System.in);
            for (int i = 0; i < numberOfStudents; i++) {
                System.out.println("Enter the name of student " + (i + 1) + ": ");
                String name = scanDetails.nextLine();
                System.out.println("Enter the age of " + (i + 1) + ": ");
                int age = scanDetails.nextInt();
                scanDetails.nextLine(); // Consume newline
                students[i] = new Student(name, age);
            }
            for (int i = 0; i < numberOfStudents; i++) {
                if (students[i].getAge() > 15) {
                    System.out.println(students[i].getName() + " is old enough to receive a vaccine.");
                } else {
                    System.out.println(students[i].getName() + " is not old enough to receive a vaccine.");
                }
            }
        }
    }
}
