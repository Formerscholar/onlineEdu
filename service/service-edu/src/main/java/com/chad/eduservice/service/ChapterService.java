package com.chad.eduservice.service;

import java.util.List;
import com.chad.eduservice.model.Chapter;
import com.baomidou.mybatisplus.extension.service.IService;
public interface ChapterService extends IService<Chapter>{


    int updateBatch(List<Chapter> list);

    int updateBatchSelective(List<Chapter> list);

    int batchInsert(List<Chapter> list);

    int insertOrUpdate(Chapter record);

    int insertOrUpdateSelective(Chapter record);

}
