package ru.job4j.pojo;

import java.time.LocalDate;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullname("Enduraev Anatoly Olegovich");
        student.setGroup("Intern Job4j");
        LocalDate admissionDate = LocalDate.of(2025, 3, 16);
        student.setAdmission(admissionDate);
        System.out.println(student.getFullname() + ", group - " + student.getGroup() + ": " + student.getAdmission());
    }
}
