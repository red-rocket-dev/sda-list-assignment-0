package pl.sda;

import java.util.ArrayList;

public class Student {
    private String name;
    private String surname;
    //TODO: dlaczego moze List lepiej?
    private ArrayList<Integer> grades;

    public Student(String name, String surname, ArrayList<Integer> grades) {
        this.name = name;
        this.surname = surname;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }
}
