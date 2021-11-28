package com.chad.eduservice.service;

import java.util.List;
import com.chad.eduservice.model.Teacher;
import com.baomidou.mybatisplus.extension.service.IService;
public interface TeacherService extends IService<Teacher>{


    int updateBatch(List<Teacher> list);

    int updateBatchSelective(List<Teacher> list);

    int batchInsert(List<Teacher> list);

    int insertOrUpdate(Teacher record);

    int insertOrUpdateSelective(Teacher record);

}
