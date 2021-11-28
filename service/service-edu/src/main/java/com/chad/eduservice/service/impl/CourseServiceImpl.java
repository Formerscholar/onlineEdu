package com.chad.eduservice.service.impl;

import com.chad.eduservice.service.CourseService;
import org.springframework.stereotype.Service;

import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chad.eduservice.mapper.CourseMapper;
import com.chad.eduservice.model.Course;

@Service
public class CourseServiceImpl extends ServiceImpl<CourseMapper, Course> implements CourseService {

    @Override
    public int updateBatch(List<Course> list) {
        return baseMapper.updateBatch(list);
    }
    @Override
    public int updateBatchSelective(List<Course> list) {
        return baseMapper.updateBatchSelective(list);
    }
    @Override
    public int batchInsert(List<Course> list) {
        return baseMapper.batchInsert(list);
    }
    @Override
    public int insertOrUpdate(Course record) {
        return baseMapper.insertOrUpdate(record);
    }
    @Override
    public int insertOrUpdateSelective(Course record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
