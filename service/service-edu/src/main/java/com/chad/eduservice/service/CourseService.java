package com.chad.eduservice.service;

import java.util.List;
import com.chad.eduservice.model.Course;
import com.baomidou.mybatisplus.extension.service.IService;
public interface CourseService extends IService<Course>{


    int updateBatch(List<Course> list);

    int updateBatchSelective(List<Course> list);

    int batchInsert(List<Course> list);

    int insertOrUpdate(Course record);

    int insertOrUpdateSelective(Course record);

}
