package com.nfs.controller;

import com.nfs.bean.Course;
import com.nfs.bean.JiFen;
import com.nfs.servicec.CourseService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/course")
@Api(tags = "对所有Course的操作")
public class CourseController {
    @Autowired
    private CourseService courseService;

    @GetMapping("/allCourse")
    @ApiOperation(value = "查询所有的Course")
    public List<Course> allCourse() {
        return courseService.allCourse();
    }

    @GetMapping("/allJiFen")
    public JiFen allJiFen(){
        return courseService.allJiFen();
    }
}
