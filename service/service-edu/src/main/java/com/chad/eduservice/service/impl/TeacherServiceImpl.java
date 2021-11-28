package com.chad.eduservice.service.impl;

import com.chad.eduservice.service.TeacherService;
import org.springframework.stereotype.Service;

import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chad.eduservice.mapper.TeacherMapper;
import com.chad.eduservice.model.Teacher;

@Service
public class TeacherServiceImpl extends ServiceImpl<TeacherMapper, Teacher> implements TeacherService {

    @Override
    public int updateBatch(List<Teacher> list) {
        return baseMapper.updateBatch(list);
    }
    @Override
    public int updateBatchSelective(List<Teacher> list) {
        return baseMapper.updateBatchSelective(list);
    }
    @Override
    public int batchInsert(List<Teacher> list) {
        return baseMapper.batchInsert(list);
    }
    @Override
    public int insertOrUpdate(Teacher record) {
        return baseMapper.insertOrUpdate(record);
    }
    @Override
    public int insertOrUpdateSelective(Teacher record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
