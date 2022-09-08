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

        studentList.stream()
                .filter(student1 -> student1.getId() == student.getId())
                .map(student1 -> {

                    student1.setStudentNumber(student.getStudentNumber());
                    student1.setFirstName(student.getFirstName());
                    student1.setLastName(student.getLastName());
                    student1.setParent(student.getParent());
                    student1.setCourses(student.getCourses());
                    return student1;

                }).findFirst().orElseThrow();

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
