package com.academy.coding.dao;

import com.academy.coding.entity.Course;
import com.academy.coding.vo.CourseSeachVo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CourseRepo extends JpaRepository<Course, Long>  {

    Optional<Course> findByTitle(String title);

    //@Query()
    //List<Course> findByCriteria(CourseSeachVo courseSeachVo);

}
