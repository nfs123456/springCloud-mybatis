package com.nfs.controller;

import com.nfs.bean.Course;
import com.nfs.servicec.CourseStockService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/stockCourse")
@Api(tags = "对所有Course库存的操作")
public class CourseController {
    @Autowired
    private CourseStockService courseStockService;
    @ApiOperation(value = "修改库存的个数")
    @PostMapping("/updateStock")
    public Boolean updateStock(@RequestBody Course course){
        return courseStockService.updateStock(course);
    }
}
