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
    * 课程科目
    */
@ApiModel(value="课程科目")
@Data
@TableName(value = "guli_edu.edu_subject")
public class Subject {
    /**
     * 课程类别ID
     */
    @TableId(value = "id", type = IdType.ASSIGN_UUID)
    @ApiModelProperty(value="课程类别ID")
    private String id;

    /**
     * 类别名称
     */
    @TableField(value = "title")
    @ApiModelProperty(value="类别名称")
    private String title;

    /**
     * 父ID
     */
    @TableField(value = "parent_id")
    @ApiModelProperty(value="父ID")
    private String parent_id;

    /**
     * 排序字段
     */
    @TableField(value = "sort")
    @ApiModelProperty(value="排序字段")
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

    public static final String COL_TITLE = "title";

    public static final String COL_PARENT_ID = "parent_id";

    public static final String COL_SORT = "sort";

    public static final String COL_GMT_CREATE = "gmt_create";

    public static final String COL_GMT_MODIFIED = "gmt_modified";
}