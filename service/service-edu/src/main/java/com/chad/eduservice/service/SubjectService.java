package com.chad.eduservice.service;

import java.util.List;
import com.chad.eduservice.model.Subject;
import com.baomidou.mybatisplus.extension.service.IService;
public interface SubjectService extends IService<Subject>{


    int updateBatch(List<Subject> list);

    int updateBatchSelective(List<Subject> list);

    int batchInsert(List<Subject> list);

    int insertOrUpdate(Subject record);

    int insertOrUpdateSelective(Subject record);

}
