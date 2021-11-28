package com.chad.eduservice.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.chad.eduservice.model.Teacher;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TeacherMapper extends BaseMapper<Teacher> {
    int updateBatch(List<Teacher> list);

    int updateBatchSelective(List<Teacher> list);

    int batchInsert(@Param("list") List<Teacher> list);

    int insertOrUpdate(Teacher record);

    int insertOrUpdateSelective(Teacher record);
}