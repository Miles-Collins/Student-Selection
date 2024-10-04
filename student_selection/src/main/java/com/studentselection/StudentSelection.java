package com.studentselection;

import java.util.Scanner;

public class StudentSelection {

    public static void main(String[] args) {
        System.out.println("Enter the number of students: ");
        try (Scanner scanner = new Scanner(System.in)) {
            int numberOfStudents = scanner.nextInt();
            Student[] students = StudentUtils.readStudentDetails(numberOfStudents);
            StudentUtils.checkStudentAge(students);
        }
    }
}
