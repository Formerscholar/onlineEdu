package com.chad.eduservice.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.chad.eduservice.model.Chapter;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ChapterMapper extends BaseMapper<Chapter> {
    int updateBatch(List<Chapter> list);

    int updateBatchSelective(List<Chapter> list);

    int batchInsert(@Param("list") List<Chapter> list);

    int insertOrUpdate(Chapter record);

    int insertOrUpdateSelective(Chapter record);
}