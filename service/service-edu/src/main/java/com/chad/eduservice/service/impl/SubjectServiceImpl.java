package com.chad.eduservice.service.impl;

import com.chad.eduservice.service.SubjectService;
import org.springframework.stereotype.Service;

import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chad.eduservice.model.Subject;
import com.chad.eduservice.mapper.SubjectMapper;

@Service
public class SubjectServiceImpl extends ServiceImpl<SubjectMapper, Subject> implements SubjectService {

    @Override
    public int updateBatch(List<Subject> list) {
        return baseMapper.updateBatch(list);
    }
    @Override
    public int updateBatchSelective(List<Subject> list) {
        return baseMapper.updateBatchSelective(list);
    }
    @Override
    public int batchInsert(List<Subject> list) {
        return baseMapper.batchInsert(list);
    }
    @Override
    public int insertOrUpdate(Subject record) {
        return baseMapper.insertOrUpdate(record);
    }
    @Override
    public int insertOrUpdateSelective(Subject record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
