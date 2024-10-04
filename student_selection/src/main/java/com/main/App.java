package com.main;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        System.out.println("Enter the number of students: ");
        try (Scanner scanner = new Scanner(System.in)) {
            int numberOfStudents = scanner.nextInt();
            String[] students = new String[numberOfStudents];
            int[] age = new int[numberOfStudents];
            Scanner scanNames = new Scanner(System.in);
            Scanner scanAge = new Scanner(System.in);
            for (int i = 0; i < numberOfStudents; i++) {
                System.out.println("Enter the name of student " + (i + 1) + ": ");
                students[i] = scanNames.nextLine();
                System.out.println("Enter the age of student " + (i + 1) + ": ");
                age[i] = scanAge.nextInt();
            }
            for (int i = 0; i < numberOfStudents; i++) {
                if (age[i] > 15) {
                    System.out.println(students[i] + " is old enough to receive a vaccine.");
                } else {
                    System.out.println(students[i] + " is not old enough to receive a vaccine.");
                }
            }

        }
    }
}
