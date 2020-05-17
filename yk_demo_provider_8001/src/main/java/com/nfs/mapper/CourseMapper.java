package com.nfs.mapper;

import com.nfs.bean.Course;
import com.nfs.bean.JiFen;

import java.util.List;

public interface CourseMapper {
    List<Course> allCourse();

    JiFen allJiFen();
}
