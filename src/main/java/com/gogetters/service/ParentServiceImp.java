package com.gogetters.service;

import com.gogetters.entity.Parent;

import java.util.List;
import java.util.stream.Collectors;

import static com.gogetters.database.Database.parentList;

public class ParentServiceImp{
    public Object findById(int id) {
        try {
            return parentList.stream()
                    .filter(parent -> parent.id==id)
                    .findFirst().orElseThrow(()->new Exception("No Id Found! "));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }


    public List findAll() {
        return parentList.stream().distinct().collect(Collectors.toList());
    }


    public void save(Object o) {
        parentList.add((Parent)o);
    }



    public void update(Object o) {
        parentList.stream()
                .filter(parent -> parent.getId() == parent.id)
                .map(parent -> {
                    parent.setId(parent.id);
                    parent.setFirstName(parent.getFirstName());
                    parent.setLastName(parent.getLastName());
                    return parent;
                });

    }


    public void deleteById(Long id) {
//        try {
//            parentList.stream()
//                    .filter(parent -> parent.getId() == parent.id)
//                    .findFirst()
//                    .orElseThrow(()->new Exception("No Id Found!"));
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//        parentList.remove(id);

        parentList.stream()
                   .filter(parent -> parent.getId() == parent.id)
                .mapToLong(Parent::hashCode)
                .peek(this::deleteById);
    }

}
