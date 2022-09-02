package com.gogetters.service;
import java.util.Scanner;
import com.gogetters.database.Database;
import com.gogetters.entity.Course;
import com.gogetters.enums.WeekDays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CourseServiceImp implements CRUDService{

    @Override
    public Object findById(int id) {
        return Database.courseList.stream()
                .filter(course -> course.id == id)
                .findFirst().get();
    }

    @Override
    public List findAll() {
        return Database.courseList;
    }

    @Override
    public void save(Object o) {
        if(o instanceof Course){
            Database.courseList.add((Course)o);
        }else{
            System.out.println("This is not a course, please add a course to the list");
        }
    }

    @Override
    public void update(Object object) {
        if(object instanceof Course){
            for (Course course : Database.courseList) {
                if (course.getId() == ((Course)(object)).getId()) {
                    course.setCourseDay(((Course)(object)).getCourseDay());
                    course.setName(((Course)(object)).getName());
                    course.setMinScore(((Course)(object)).getMinScore());
                }
            }
        }
    }//end of module

    @Override
    public void deleteById(Long id) {
        Database.courseList.removeIf(course -> course.id == id);
    }
}
/*
Scanner keyboard = new Scanner(System.in);
        if (object instanceof Course){
            while (true){
                System.out.println("Which section would you like to change: ");
                System.out.println("Name of course: 1");
                System.out.println("Min score: 2");
                System.out.println("Day of week: 3");
                System.out.println("Enter 4 to finish");
                int option = keyboard.nextInt();
                switch (option){
                    case 1:
                        System.out.println("New name: ");
                        String name = keyboard.next();
                        for (Course course : Database.courseList) {
                            if(((Course) object).getId() == course.getId()){
                                ((Course) object).setName(((Course) object).getName());
                            }
                        }
                        break;
                    case 2:
                        System.out.println("New score: ");
                        int score = keyboard.nextInt();
                        for (Course course : Database.courseList) {
                            if(((Course) object).getId() == course.getId()){
                                ((Course) object).setMinScore(score);
                            }
                        }
                        break;
                    case 3:
                        System.out.println("New day: ");
                        for (Course course : Database.courseList) {
                            if(((Course) object).getId() == course.getId()){

                            }
                        }
                        break;
                    case 4:
                        return;
                }//end of switch
                return;
            }//end of while
        }//end of if
 */