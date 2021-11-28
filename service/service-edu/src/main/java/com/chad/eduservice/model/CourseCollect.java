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
    * 课程收藏
    */
@ApiModel(value="课程收藏")
@Data
@TableName(value = "guli_edu.edu_course_collect")
public class CourseCollect {
    /**
     * 收藏ID
     */
    @TableId(value = "id", type = IdType.ASSIGN_UUID)
    @ApiModelProperty(value="收藏ID")
    private String id;

    /**
     * 课程讲师ID
     */
    @TableField(value = "course_id")
    @ApiModelProperty(value="课程讲师ID")
    private String course_id;

    /**
     * 课程专业ID
     */
    @TableField(value = "member_id")
    @ApiModelProperty(value="课程专业ID")
    private String member_id;

    /**
     * 逻辑删除 1（true）已删除， 0（false）未删除
     */
    @TableField(value = "is_deleted")
    @ApiModelProperty(value="逻辑删除 1（true）已删除， 0（false）未删除")
    private Byte is_deleted;

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

    public static final String COL_MEMBER_ID = "member_id";

    public static final String COL_IS_DELETED = "is_deleted";

    public static final String COL_GMT_CREATE = "gmt_create";

    public static final String COL_GMT_MODIFIED = "gmt_modified";
}