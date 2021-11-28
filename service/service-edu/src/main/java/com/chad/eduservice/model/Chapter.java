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
    * 课程
    */
@ApiModel(value="课程")
@Data
@TableName(value = "guli_edu.edu_chapter")
public class Chapter {
    /**
     * 章节ID
     */
    @TableId(value = "id", type = IdType.ASSIGN_UUID)
    @ApiModelProperty(value="章节ID")
    private String id;

    /**
     * 课程ID
     */
    @TableField(value = "course_id")
    @ApiModelProperty(value="课程ID")
    private String course_id;

    /**
     * 章节名称
     */
    @TableField(value = "title")
    @ApiModelProperty(value="章节名称")
    private String title;

    /**
     * 显示排序
     */
    @TableField(value = "sort")
    @ApiModelProperty(value="显示排序")
    private Integer sort;

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

    public static final String COL_COURSE_ID = "course_id";

    public static final String COL_TITLE = "title";

    public static final String COL_SORT = "sort";

    public static final String COL_GMT_CREATE = "gmt_create";

    public static final String COL_GMT_MODIFIED = "gmt_modified";
}