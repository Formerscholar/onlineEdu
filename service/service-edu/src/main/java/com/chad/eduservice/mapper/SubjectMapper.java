package com.chad.eduservice.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.chad.eduservice.model.Subject;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SubjectMapper extends BaseMapper<Subject> {
    int updateBatch(List<Subject> list);

    int updateBatchSelective(List<Subject> list);

    int batchInsert(@Param("list") List<Subject> list);

    int insertOrUpdate(Subject record);

    int insertOrUpdateSelective(Subject record);
}