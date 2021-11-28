package com.chad.eduservice.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.chad.eduservice.model.Video;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface VideoMapper extends BaseMapper<Video> {
    int updateBatch(List<Video> list);

    int updateBatchSelective(List<Video> list);

    int batchInsert(@Param("list") List<Video> list);

    int insertOrUpdate(Video record);

    int insertOrUpdateSelective(Video record);
}