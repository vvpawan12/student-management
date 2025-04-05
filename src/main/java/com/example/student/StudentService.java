package com.example.student;

import com.example.student.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentService {
    private final List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public int getTotalStudents() {
        return students.size();
    }

    public Student getStudent(int index) {
        return students.get(index);
    }
}
