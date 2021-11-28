package com.chad.eduservice.service.impl;

import com.chad.eduservice.service.CourseCollectService;
import org.springframework.stereotype.Service;

import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chad.eduservice.model.CourseCollect;
import com.chad.eduservice.mapper.CourseCollectMapper;

@Service
public class CourseCollectServiceImpl extends ServiceImpl<CourseCollectMapper, CourseCollect> implements CourseCollectService {

    @Override
    public int updateBatch(List<CourseCollect> list) {
        return baseMapper.updateBatch(list);
    }
    @Override
    public int updateBatchSelective(List<CourseCollect> list) {
        return baseMapper.updateBatchSelective(list);
    }
    @Override
    public int batchInsert(List<CourseCollect> list) {
        return baseMapper.batchInsert(list);
    }
    @Override
    public int insertOrUpdate(CourseCollect record) {
        return baseMapper.insertOrUpdate(record);
    }
    @Override
    public int insertOrUpdateSelective(CourseCollect record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
