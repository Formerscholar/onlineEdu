package com.chad.eduservice.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.chad.eduservice.model.CourseDescription;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CourseDescriptionMapper extends BaseMapper<CourseDescription> {
    int updateBatch(List<CourseDescription> list);

    int updateBatchSelective(List<CourseDescription> list);

    int batchInsert(@Param("list") List<CourseDescription> list);

    int insertOrUpdate(CourseDescription record);

    int insertOrUpdateSelective(CourseDescription record);
}