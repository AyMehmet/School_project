package com.gogetters.service;
import com.gogetters.entity.Course;
import java.util.List;
import static com.gogetters.database.Database.courseList;

public class CourseServiceImp implements CRUDService<Course>{

    @Override
    public Course findById(int id) {
        return courseList.stream()
                .filter(course -> course.id == id)
                .findFirst().get();
    }

    @Override
    public List findAll() {
        return courseList;
    }

    public void save(Course o) {
            courseList.add(o);
    }

    public void update(Course object) {
            for (Course course : courseList) {
                if (course.getId() == (object).getId()) {
                    course.setCourseDay(object.getCourseDay());
                    course.setName(object.getName());
                    course.setMinScore(object.getMinScore());
                }
            }
    }//end of module

    @Override
    public void deleteById(Long id) {courseList.removeIf(course -> course.id == id);
    }
}