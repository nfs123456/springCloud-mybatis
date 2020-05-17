package com.nfs.servicec;

import com.nfs.bean.Course;
import com.nfs.bean.JiFen;

import java.util.List;

public interface CourseService {
    List<Course> allCourse();

    JiFen allJiFen();
}
