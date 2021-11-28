package com.chad.eduservice.service;

import com.chad.eduservice.model.Comment;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.IService;
public interface CommentService extends IService<Comment>{


    int updateBatch(List<Comment> list);

    int updateBatchSelective(List<Comment> list);

    int batchInsert(List<Comment> list);

    int insertOrUpdate(Comment record);

    int insertOrUpdateSelective(Comment record);

}
