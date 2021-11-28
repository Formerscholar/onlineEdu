package com.chad.eduservice.service.impl;

import com.chad.eduservice.service.VideoService;
import org.springframework.stereotype.Service;

import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chad.eduservice.mapper.VideoMapper;
import com.chad.eduservice.model.Video;

@Service
public class VideoServiceImpl extends ServiceImpl<VideoMapper, Video> implements VideoService {

    @Override
    public int updateBatch(List<Video> list) {
        return baseMapper.updateBatch(list);
    }
    @Override
    public int updateBatchSelective(List<Video> list) {
        return baseMapper.updateBatchSelective(list);
    }
    @Override
    public int batchInsert(List<Video> list) {
        return baseMapper.batchInsert(list);
    }
    @Override
    public int insertOrUpdate(Video record) {
        return baseMapper.insertOrUpdate(record);
    }
    @Override
    public int insertOrUpdateSelective(Video record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
