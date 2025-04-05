package com.example.student;

import com.example.student.model.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StudentServiceTest {

    @Test
    public void testAddStudent() {
        StudentService service = new StudentService();
        Student student = new Student(1, "Alice");
        service.addStudent(student);

        Assertions.assertEquals(1, service.getTotalStudents());
        Assertions.assertEquals("Alice", service.getStudent(0).getName());
    }
}
