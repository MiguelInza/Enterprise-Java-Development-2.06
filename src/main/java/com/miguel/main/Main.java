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

        Map<String, Student> studentMap = new HashMap<>();
        studentMap.put(student1.getName(), student1);
        studentMap.put(student2.getName(), student2);
        studentMap.put(student3.getName(), student3);
        studentMap.put(student4.getName(), student4);
        System.out.println(studentMap);
        System.out.println(studentMap.get("Victor"));
    }
    }



