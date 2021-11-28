package com.chad.eduservice.service.impl;

import com.chad.eduservice.service.CourseDescriptionService;
import org.springframework.stereotype.Service;

import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chad.eduservice.mapper.CourseDescriptionMapper;
import com.chad.eduservice.model.CourseDescription;

@Service
public class CourseDescriptionServiceImpl extends ServiceImpl<CourseDescriptionMapper, CourseDescription> implements CourseDescriptionService {

    @Override
    public int updateBatch(List<CourseDescription> list) {
        return baseMapper.updateBatch(list);
    }
    @Override
    public int updateBatchSelective(List<CourseDescription> list) {
        return baseMapper.updateBatchSelective(list);
    }
    @Override
    public int batchInsert(List<CourseDescription> list) {
        return baseMapper.batchInsert(list);
    }
    @Override
    public int insertOrUpdate(CourseDescription record) {
        return baseMapper.insertOrUpdate(record);
    }
    @Override
    public int insertOrUpdateSelective(CourseDescription record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
