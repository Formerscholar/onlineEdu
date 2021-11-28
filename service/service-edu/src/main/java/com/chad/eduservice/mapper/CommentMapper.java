package com.chad.eduservice.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.chad.eduservice.model.Comment;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CommentMapper extends BaseMapper<Comment> {
    int updateBatch(List<Comment> list);

    int updateBatchSelective(List<Comment> list);

    int batchInsert(@Param("list") List<Comment> list);

    int insertOrUpdate(Comment record);

    int insertOrUpdateSelective(Comment record);
}