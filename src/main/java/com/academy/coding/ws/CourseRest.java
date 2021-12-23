package com.academy.coding.ws;

import com.academy.coding.entity.Course;
import com.academy.coding.service.facade.CourseService;
import com.academy.coding.vo.CourseSeachVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/course")
public class CourseRest {

    @Autowired
    CourseService courseService;

    @GetMapping("/title/{title}")
    public Course findByTitle(@PathVariable String title) {
        Optional<Course> courseOpt = courseService.findByTitle(title);
        if (courseOpt.isPresent()) {
            return courseOpt.get();
        }
        return new Course();
    }

    @PostMapping("/")
    public int save(@RequestBody Course course) {
        if(course.getTitle() == null || course.getRef() == null )
            throw new RuntimeException("Le titre et la ref ne doivent pas être null");
        return courseService.save(course);
    }

    @GetMapping("/")
    public List<Course> findAll() {
        return courseService.findAll();
    }

    @GetMapping("/serchByCriteria")
    public List<Course> serchByCriteria(@RequestBody CourseSeachVo courseSeachVo) {
        return courseService.searchByCriteria(courseSeachVo);
    }
}
