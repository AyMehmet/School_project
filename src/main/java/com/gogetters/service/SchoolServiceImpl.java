package com.gogetters.service;

import com.gogetters.database.Database;
import com.gogetters.entity.School;
import java.util.Scanner;
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
        return Database.schoolList;
    }

    @Override
    public void save(School school) {

        Database.schoolList.add(school);

    }


    @Override
    public void update(School school) {
        School sc =Database.schoolList
                .stream()
                .filter(p->p.equals(school))
                .findFirst().orElseThrow();
        System.out.println("Please enter the new name of the school");
        Scanner input = new Scanner(System.in);
        String s = input.next();

        sc.setName(s);
        System.out.println("successful, school's name is updated");

    }



    @Override
    public void deleteById(Long id) {
        School sc=Database.schoolList
                .stream()
                .filter(p->p.getId()==id)
                .findFirst().orElseThrow();
        Database.schoolList.remove(sc);



    }
}
