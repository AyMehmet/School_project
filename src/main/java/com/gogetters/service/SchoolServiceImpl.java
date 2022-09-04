package com.gogetters.service;

import com.gogetters.database.Database;
import com.gogetters.entity.School;
import java.util.Scanner;
import java.util.List;
import java.util.stream.Collectors;

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
        Database.schoolList.stream()
                .filter(school1 -> school1.getId()== school.id)
                .map(school1 -> new School())
                .collect(Collectors.toList());

//        System.out.println("Please enter the school id that you want to update");
//        Scanner input = new Scanner(System.in);
//        int s = input.nextInt();
//        School sc =Database.schoolList
//                .stream()
//                .filter(p->p.id ==s )
//                .findFirst().orElseThrow();
//        sc= school;


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
