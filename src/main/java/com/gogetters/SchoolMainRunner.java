package com.gogetters;

import com.gogetters.entity.Course;
import com.gogetters.entity.Parent;
import com.gogetters.entity.School;
import com.gogetters.entity.Student;
import com.gogetters.service.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static com.gogetters.database.Database.courseList;
import static com.gogetters.database.Database.studentList;

public class SchoolMainRunner {

    public  static ParentServiceImpl parentService;

//    public static CRUDService<School> schoolService;
//    public static CRUDService<Course> courseService;
//    public static CRUDService<Parent> parentService;
//    public static CRUDService<Student> studentService;
//
//    static {
//        SchoolMainRunner.schoolService = new SchoolService();
//        SchoolMainRunner.courseService = new CourseService();
//        SchoolMainRunner.parentService = new ParentService();
//        SchoolMainRunner.studentService = new StudentService();
//    }

    public static void main(String[] args) {

        SchoolServiceImpl sc = new SchoolServiceImpl();

        System.out.println(sc.findById(1));

        System.out.println(sc.findAll());


//        List<Student> studentList007 = new ArrayList<>();
//        List<Course> courseList007 = new ArrayList<>();
//        School school007 = new School("School007", studentList007, courseList007);
//        sc.update(school007);
//        System.out.println(sc.findAll());


        sc.deleteById(2L);
        System.out.println(sc.findAll());


































    }


}
