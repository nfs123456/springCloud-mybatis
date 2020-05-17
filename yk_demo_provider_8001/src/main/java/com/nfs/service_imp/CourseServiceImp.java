package com.nfs.service_imp;

import com.nfs.bean.Course;
import com.nfs.bean.JiFen;
import com.nfs.mapper.CourseMapper;
import com.nfs.servicec.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImp implements CourseService {

    @Autowired
    private CourseMapper courseMapper;
    @Override
    public List<Course> allCourse() {
        return courseMapper.allCourse();
    }

    @Override
    public JiFen allJiFen() {
        return courseMapper.allJiFen();
    }
}
