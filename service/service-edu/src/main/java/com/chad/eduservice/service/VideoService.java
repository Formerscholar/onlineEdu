package com.chad.eduservice.service;

import java.util.List;
import com.chad.eduservice.model.Video;
import com.baomidou.mybatisplus.extension.service.IService;
public interface VideoService extends IService<Video>{


    int updateBatch(List<Video> list);

    int updateBatchSelective(List<Video> list);

    int batchInsert(List<Video> list);

    int insertOrUpdate(Video record);

    int insertOrUpdateSelective(Video record);

}
