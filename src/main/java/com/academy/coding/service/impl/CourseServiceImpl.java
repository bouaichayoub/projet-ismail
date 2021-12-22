package com.academy.coding.service.impl;

import com.academy.coding.entity.Course;
import com.academy.coding.service.facade.CourseService;
import com.academy.coding.vo.CourseSeachVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.academy.coding.dao.CourseRepo;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Optional;

@Service
public class CourseServiceImpl extends AbstractService implements CourseService {

    @Autowired
    EntityManager em;

    @Override
    public Optional<Course> findByTitle(String title) {
        return courseRepository.findByTitle(title);
    }

    @Override
    public int save(Course course) {
        if (findByTitle(course.getTitle()) != null) {
            return -1;
        } else{
            courseRepository.save(course);
            return 1;
        }
    }

    @Override
    public List<Course> findAll() {
        return courseRepository.findAll();
    }

    public List<Course> serchByCriteria(CourseSeachVo courseSeachVo){
        String query = init("Course", "c");
        query+=addConstraint("c","title",courseSeachVo.getTitle());
        return em.createQuery(query).getResultList();
    }

    @Autowired
    private CourseRepo courseRepository;


}
