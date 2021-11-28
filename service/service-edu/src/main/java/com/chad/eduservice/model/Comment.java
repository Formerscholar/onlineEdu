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
    * 评论
    */
@ApiModel(value="评论")
@Data
@TableName(value = "guli_edu.edu_comment")
public class Comment {
    /**
     * 讲师ID
     */
    @TableId(value = "id", type = IdType.ASSIGN_UUID)
    @ApiModelProperty(value="讲师ID")
    private String id;

    /**
     * 课程id
     */
    @TableField(value = "course_id")
    @ApiModelProperty(value="课程id")
    private String course_id;

    /**
     * 讲师id
     */
    @TableField(value = "teacher_id")
    @ApiModelProperty(value="讲师id")
    private String teacher_id;

    /**
     * 会员id
     */
    @TableField(value = "member_id")
    @ApiModelProperty(value="会员id")
    private String member_id;

    /**
     * 会员昵称
     */
    @TableField(value = "nickname")
    @ApiModelProperty(value="会员昵称")
    private String nickname;

    /**
     * 会员头像
     */
    @TableField(value = "avatar")
    @ApiModelProperty(value="会员头像")
    private String avatar;

    /**
     * 评论内容
     */
    @TableField(value = "content")
    @ApiModelProperty(value="评论内容")
    private String content;

    /**
     * 逻辑删除 1（true）已删除， 0（false）未删除
     */
    @TableField(value = "is_deleted")
    @ApiModelProperty(value="逻辑删除 1（true）已删除， 0（false）未删除")
    private Boolean is_deleted;

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

    public static final String COL_TEACHER_ID = "teacher_id";

    public static final String COL_MEMBER_ID = "member_id";

    public static final String COL_NICKNAME = "nickname";

    public static final String COL_AVATAR = "avatar";

    public static final String COL_CONTENT = "content";

    public static final String COL_IS_DELETED = "is_deleted";

    public static final String COL_GMT_CREATE = "gmt_create";

    public static final String COL_GMT_MODIFIED = "gmt_modified";
}