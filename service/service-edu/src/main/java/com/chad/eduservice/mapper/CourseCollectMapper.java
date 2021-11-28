package com.chad.eduservice.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.chad.eduservice.model.CourseCollect;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CourseCollectMapper extends BaseMapper<CourseCollect> {
    int updateBatch(List<CourseCollect> list);

    int updateBatchSelective(List<CourseCollect> list);

    int batchInsert(@Param("list") List<CourseCollect> list);

    int insertOrUpdate(CourseCollect record);

    int insertOrUpdateSelective(CourseCollect record);
}