package com.nfs.service_imp;

import com.nfs.bean.Course;
import com.nfs.mapper.CourseStockMapper;
import com.nfs.servicec.CourseStockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseStockServiceImp implements CourseStockService {

    @Autowired
    private CourseStockMapper courseStockMapper;

    @Override
    public Boolean updateStock(Course course) {
        return courseStockMapper.updateStock(course);
    }
}
