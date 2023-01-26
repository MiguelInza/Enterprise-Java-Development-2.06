package com.miguel.main;

import com.miguel.classes.Student;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        try {
            Student student1 = new Student("Victor", 94);
            System.out.println(student1.getGrade());
        } catch (IllegalArgumentException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        try {
            Student student2 = new Student("Pedro", 14);
            System.out.println(student2.getGrade());
        } catch (IllegalArgumentException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        try {
            Student student3 = new Student("Antonio", 19);
            System.out.println(student3.getGrade());
        } catch (IllegalArgumentException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        try {
            Student student4 = new Student("Alberto", 25);
            System.out.println(student4.getGrade());
        } catch (IllegalArgumentException e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        Student student1 = new Student("Victor", 64);
        Student student2 = new Student("Pedro", 14);
        Student student3 = new Student("Antonio", 19);
        Student student4 = new Student("Alberto", 25);

        Map<String, Student> students = new HashMap<>();
        students.put(student1.getName(), student1);
        students.put(student2.getName(), student2);
        students.put(student3.getName(), student3);
        students.put(student4.getName(), student4);
        System.out.println(students);
        System.out.println(students.get("Victor"));

        students = increaseGrades(students);

        System.out.println("Grades after 10% increase: ");
        for (Map.Entry<String, Student> entry : students.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue().getGrade());
        }
    }

    public static Map<String, Student> increaseGrades(Map<String, Student> students) {
        for (Map.Entry<String, Student> entry : students.entrySet()) {
            int newGrade = (int) (entry.getValue().getGrade() * 1.1);
            entry.getValue().setGrade(newGrade);
        }
        return students;
    }
}



