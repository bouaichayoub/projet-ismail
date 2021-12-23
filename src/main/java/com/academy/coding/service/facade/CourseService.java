package com.academy.coding.service.facade;

import com.academy.coding.entity.Course;
import com.academy.coding.vo.CourseSeachVo;

import java.util.List;
import java.util.Optional;

public interface CourseService {
    Optional<Course> findByTitle(String title);
    int save(Course course);
    List<Course> findAll();
    List<Course> searchByCriteria(CourseSeachVo courseSeachVo);

}
