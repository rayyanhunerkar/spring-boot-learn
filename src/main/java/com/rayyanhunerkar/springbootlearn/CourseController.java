package com.rayyanhunerkar.springbootlearn;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    @RequestMapping("/courses")
    public List<Course> retrieveAllCourses() {
        return Arrays.asList(
                new Course(1, "Learn AWS", "Rayyan Hunerkar"),
                new Course(2, "Learn Python", "Rayyan Hunerkar"),
                new Course(2, "Learn SQL", "Rayyan Hunerkar")
        );
    }
}
