package com.gogetters.service;

import com.gogetters.database.Database;
import com.gogetters.entity.School;

import java.util.List;

public class SchoolServiceImpl implements CRUDService<School>{
    @Override
    public School findById(int id) {
        return Database.schoolList.stream()
                .filter(school -> school.id==id)
                .findFirst().orElseThrow();



    }

    @Override
    public List<School> findAll() {
        return null;
    }

    @Override
    public void save(School school) {

    }

    @Override
    public void update(School school) {

    }

    @Override
    public void deleteById(Long id) {

    }
}
