package com.chad.eduservice.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.chad.eduservice.model.Course;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CourseMapper extends BaseMapper<Course> {
    int updateBatch(List<Course> list);

    int updateBatchSelective(List<Course> list);

    int batchInsert(@Param("list") List<Course> list);

    int insertOrUpdate(Course record);

    int insertOrUpdateSelective(Course record);
}