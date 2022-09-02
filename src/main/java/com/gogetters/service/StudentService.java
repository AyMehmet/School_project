package com.gogetters.service;

import com.gogetters.entity.Student;

import java.util.List;

import static com.gogetters.database.Database.studentList;

public class StudentService implements CRUDService<Student> {

    @Override
    public Student findById(int id) {

        return studentList
                .stream()
                .filter(student -> student.getId() == id)
                .findFirst().orElseThrow(() -> new RuntimeException("no such a student"));
    }

    @Override
    public List<Student> findAll() {
        return studentList;
    }

    @Override
    public void save(Student student) {

        studentList.add(student);
    }

    @Override
    public void update(Student student) {

    }

    @Override
    public void deleteById(Long id) {

        studentList.removeIf(student -> student.getId() == id);

     /*   Student studentToRemove = studentList.stream()
                .filter(student -> student.getId() == id)
                .findFirst().orElseThrow(() -> new RuntimeException("no such a student"));

        studentList.remove(studentToRemove);


      */
    }
}
