package com.chad.eduservice.service.impl;

import com.chad.eduservice.service.ChapterService;
import org.springframework.stereotype.Service;

import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chad.eduservice.mapper.ChapterMapper;
import com.chad.eduservice.model.Chapter;

@Service
public class ChapterServiceImpl extends ServiceImpl<ChapterMapper, Chapter> implements ChapterService {

    @Override
    public int updateBatch(List<Chapter> list) {
        return baseMapper.updateBatch(list);
    }
    @Override
    public int updateBatchSelective(List<Chapter> list) {
        return baseMapper.updateBatchSelective(list);
    }
    @Override
    public int batchInsert(List<Chapter> list) {
        return baseMapper.batchInsert(list);
    }
    @Override
    public int insertOrUpdate(Chapter record) {
        return baseMapper.insertOrUpdate(record);
    }
    @Override
    public int insertOrUpdateSelective(Chapter record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
