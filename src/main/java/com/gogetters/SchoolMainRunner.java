package com.gogetters;

import com.gogetters.entity.Course;
import com.gogetters.entity.Parent;
import com.gogetters.entity.School;
import com.gogetters.entity.Student;
import com.gogetters.service.*;

public class SchoolMainRunner {



    public static CRUDService<School> schoolService;
    public static CRUDService<Course> courseService;
    public static CRUDService<Parent> parentService;
    public static CRUDService<Student> studentService;


    static {
        SchoolMainRunner.schoolService = new SchoolService();
        SchoolMainRunner.courseService = new CourseService();
        SchoolMainRunner.parentService = new ParentService();
        SchoolMainRunner.studentService = new StudentService();
    }

    public static void main(String[] args) throws Exception{


//********************************* Course Service ********************//



//     System.out.println(courseService.findById(7));
//
//        courseService.save(new Course(5,"math1",55,List.of(WeekDays.WEDNESDAY,WeekDays.THURSDAY)));
//        for (Course course : courseService.findAll()) {
//            System.out.println(course);
//        }
//
//        courseService.deleteById(5L);
//        for (Course course : courseService.findAll()) {
//            System.out.println(course);
//        }
////
//        courseService.update(new Course(2,"english",70,List.of(WeekDays.FRIDAY)));
//        for (Course course : courseService.findAll()) {
//            System.out.println(course);
//        }

//********************************* Parent Service ********************//

//        System.out.println(parentService.findById(1));
//
//        parentService.save(new Parent(6,"Gulcin","Lucy"));
//
//        for (Parent parent : parentService.findAll()) {
//            System.out.println(parent);
//        }
//
//        parentService.deleteById(1L);
//        for (Parent parent : parentService.findAll()) {
//            System.out.println(parent);
//        }
//
//        parentService.update(new Parent(2,"Lucy","Gülcin"));
//        for (Parent parent : parentService.findAll()) {
//            System.out.println(parent);
//        }
//
// //********************************* School Service ********************//
//
//        System.out.println(schoolService.findById(1));
//
//        schoolService.save(new School(5,"cydeo",Database.studentList,Database.courseList));
//
//        for (School school : schoolService.findAll()) {
//            System.out.println(school);
//        }
//
//       schoolService.deleteById(2L);
//        for (School school : schoolService.findAll()) {
//            System.out.println(school);
//        }
//
//        schoolService.update(new School(5,"newCydeo",Database.studentList,Database.courseList));
//        for (School school : schoolService.findAll()) {
//            System.out.println(school);
//        }
//

//********************************* Student Service ********************//

//       System.out.println(studentService.findById(6));
//
//        studentService.save(new Student(44L,"memo","memo11",new Parent(4,"memoParent","memoParent12"),List.of(new Course(5,"math",50,List.of(WeekDays.MONDAY,WeekDays.THURSDAY)))));
//
//        for (Student student : studentService.findAll()) {
//            System.out.println(student);
//        }

//        studentService.deleteById(1L);
//        for (Student student : studentService.findAll()) {
//            System.out.println(student);
//        }
//
//        List<Course> list = Arrays.asList(Database.courseList.get(0));
//
//        Student updatedStudent = new Student(2, 11L, "kyoung", "kim", new Parent("nurbanu", "terzioglu"), list);
//
//        studentService.update(updatedStudent);
//
//        for (Student student : studentService.findAll()) {
//            System.out.println(student);
        }


    }




