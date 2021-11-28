package com.chad.eduservice.service;

import java.util.List;
import com.chad.eduservice.model.CourseCollect;
import com.baomidou.mybatisplus.extension.service.IService;
public interface CourseCollectService extends IService<CourseCollect>{


    int updateBatch(List<CourseCollect> list);

    int updateBatchSelective(List<CourseCollect> list);

    int batchInsert(List<CourseCollect> list);

    int insertOrUpdate(CourseCollect record);

    int insertOrUpdateSelective(CourseCollect record);

}
