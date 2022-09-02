package com.gogetters.service;
import com.gogetters.entity.Course;
import java.util.List;
import static com.gogetters.database.Database.courseList;

public class CourseServiceImp implements CRUDService{

    @Override
    public Object findById(int id) {
        return courseList.stream()
                .filter(course -> course.id == id)
                .findFirst().get();
    }

    @Override
    public List findAll() {
        return courseList;
    }


    public void save(Course o) {
            courseList.add((Course)o);
    }

    public void update(Course object) {
            for (Course course : courseList) {
                if (course.getId() == ((Course)(object)).getId()) {
                    course.setCourseDay(((Course)(object)).getCourseDay());
                    course.setName(((Course)(object)).getName());
                    course.setMinScore(((Course)(object)).getMinScore());
                }
            }
    }//end of module

    @Override
    public void deleteById(Long id) {courseList.removeIf(course -> course.id == id);
    }
}