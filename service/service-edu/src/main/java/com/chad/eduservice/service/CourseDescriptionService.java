package com.chad.eduservice.service;

import java.util.List;
import com.chad.eduservice.model.CourseDescription;
import com.baomidou.mybatisplus.extension.service.IService;
public interface CourseDescriptionService extends IService<CourseDescription>{


    int updateBatch(List<CourseDescription> list);

    int updateBatchSelective(List<CourseDescription> list);

    int batchInsert(List<CourseDescription> list);

    int insertOrUpdate(CourseDescription record);

    int insertOrUpdateSelective(CourseDescription record);

}
