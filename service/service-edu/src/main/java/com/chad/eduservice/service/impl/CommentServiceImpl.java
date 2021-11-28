package com.chad.eduservice.service.impl;

import com.chad.eduservice.service.CommentService;
import org.springframework.stereotype.Service;

import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chad.eduservice.model.Comment;
import com.chad.eduservice.mapper.CommentMapper;

@Service
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment> implements CommentService {

    @Override
    public int updateBatch(List<Comment> list) {
        return baseMapper.updateBatch(list);
    }
    @Override
    public int updateBatchSelective(List<Comment> list) {
        return baseMapper.updateBatchSelective(list);
    }
    @Override
    public int batchInsert(List<Comment> list) {
        return baseMapper.batchInsert(list);
    }
    @Override
    public int insertOrUpdate(Comment record) {
        return baseMapper.insertOrUpdate(record);
    }
    @Override
    public int insertOrUpdateSelective(Comment record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
