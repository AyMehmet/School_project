package com.gogetters;

import com.gogetters.database.Database;
import com.gogetters.entity.Course;
import com.gogetters.entity.Parent;
import com.gogetters.entity.School;
import com.gogetters.entity.Student;
import com.gogetters.service.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SchoolMainRunner {

//    public static CRUDService<School> schoolService;
//    public static CRUDService<Course> courseService;
//    public static CRUDService<Parent> parentService;
   public static CRUDService<Student> studentService;
//
    static {
//        SchoolMainRunner.schoolService = new SchoolService();
//        SchoolMainRunner.courseService = new CourseService();
//        SchoolMainRunner.parentService = new ParentService();
        SchoolMainRunner.studentService = new StudentService();
    }

    public static void main(String[] args) {

//        System.out.println(studentService.findById(1));
//
//        System.out.println(studentService.findAll());

        for (Student student : studentService.findAll()) {
            System.out.println(student);
        }

        studentService.deleteById(1L);

        for (Student student : studentService.findAll()) {
            System.out.println(student);
        }

        List<Course> list = Arrays.asList(Database.courseList.get(0));

        Student updatedStudent = new Student(2, 11L, "kyoung", "kim", new Parent("nurbanu", "terzioglu"),list);

        studentService.update(updatedStudent);

        for (Student student : studentService.findAll()) {
            System.out.println(student);
        }


    }
}
