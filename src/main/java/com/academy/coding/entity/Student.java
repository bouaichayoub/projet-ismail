package com.academy.coding.entity;

import com.academy.coding.dao.CourseRepo;

import javax.persistence.*;
import java.util.List;

@Entity
public class Student {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private  String name;
    @OneToMany(mappedBy = "student")
    private List<Course> courses;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
