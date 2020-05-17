package com.nfs.feign_service;

import com.nfs.bean.Course;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "microservicecloud-stock")
@RequestMapping("/stockCourse")
public interface CourseStockService {
    @PostMapping("/updateStock")
    public Boolean updateStock(@RequestBody Course course);
}
