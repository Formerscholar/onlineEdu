package com.chad.eduservice.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

/**
    * 课程简介
    */
@ApiModel(value="课程简介")
@Data
@TableName(value = "guli_edu.edu_course_description")
public class CourseDescription {
    /**
     * 课程ID
     */
    @TableId(value = "id", type = IdType.ASSIGN_UUID)
    @ApiModelProperty(value="课程ID")
    private String id;

    /**
     * 课程简介
     */
    @TableField(value = "description")
    @ApiModelProperty(value="课程简介")
    private String description;

    /**
     * 创建时间
     */
    @TableField(value = "gmt_create")
    @ApiModelProperty(value="创建时间")
    private Date gmt_create;

    /**
     * 更新时间
     */
    @TableField(value = "gmt_modified")
    @ApiModelProperty(value="更新时间")
    private Date gmt_modified;

    public static final String COL_ID = "id";

    public static final String COL_DESCRIPTION = "description";

    public static final String COL_GMT_CREATE = "gmt_create";

    public static final String COL_GMT_MODIFIED = "gmt_modified";
}