package com.app.springboot.learningSpringBoot;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {


    @RequestMapping("/courses")
    public List<Course> coursedetails(){
            return Arrays.asList(
                    new Course(1,"Learn AWS","John"),
                    new Course(2,"Learn WebDev","Kedar"),
                    new Course(3,"Learn Azure","Tushar")

            );
    }
}
