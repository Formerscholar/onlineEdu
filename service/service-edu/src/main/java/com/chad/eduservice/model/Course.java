package com.chad.eduservice.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
    * 课程
    */
@ApiModel(value="课程")
@Data
@TableName(value = "guli_edu.edu_course")
public class Course {
    /**
     * 课程ID
     */
    @TableId(value = "id", type = IdType.ASSIGN_UUID)
    @ApiModelProperty(value="课程ID")
    private String id;

    /**
     * 课程讲师ID
     */
    @TableField(value = "teacher_id")
    @ApiModelProperty(value="课程讲师ID")
    private String teacher_id;

    /**
     * 课程专业ID
     */
    @TableField(value = "subject_id")
    @ApiModelProperty(value="课程专业ID")
    private String subject_id;

    /**
     * 课程专业父级ID
     */
    @TableField(value = "subject_parent_id")
    @ApiModelProperty(value="课程专业父级ID")
    private String subject_parent_id;

    /**
     * 课程标题
     */
    @TableField(value = "title")
    @ApiModelProperty(value="课程标题")
    private String title;

    /**
     * 课程销售价格，设置为0则可免费观看
     */
    @TableField(value = "price")
    @ApiModelProperty(value="课程销售价格，设置为0则可免费观看")
    private BigDecimal price;

    /**
     * 总课时
     */
    @TableField(value = "lesson_num")
    @ApiModelProperty(value="总课时")
    private Integer lesson_num;

    /**
     * 课程封面图片路径
     */
    @TableField(value = "cover")
    @ApiModelProperty(value="课程封面图片路径")
    private String cover;

    /**
     * 销售数量
     */
    @TableField(value = "buy_count")
    @ApiModelProperty(value="销售数量")
    private Long buy_count;

    /**
     * 浏览数量
     */
    @TableField(value = "view_count")
    @ApiModelProperty(value="浏览数量")
    private Long view_count;

    /**
     * 乐观锁
     */
    @TableField(value = "version")
    @ApiModelProperty(value="乐观锁")
    private Long version;

    /**
     * 课程状态 Draft未发布  Normal已发布
     */
    @TableField(value = "`status`")
    @ApiModelProperty(value="课程状态 Draft未发布  Normal已发布")
    private String status;

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

    public static final String COL_TEACHER_ID = "teacher_id";

    public static final String COL_SUBJECT_ID = "subject_id";

    public static final String COL_SUBJECT_PARENT_ID = "subject_parent_id";

    public static final String COL_TITLE = "title";

    public static final String COL_PRICE = "price";

    public static final String COL_LESSON_NUM = "lesson_num";

    public static final String COL_COVER = "cover";

    public static final String COL_BUY_COUNT = "buy_count";

    public static final String COL_VIEW_COUNT = "view_count";

    public static final String COL_VERSION = "version";

    public static final String COL_STATUS = "status";

    public static final String COL_IS_DELETED = "is_deleted";

    public static final String COL_GMT_CREATE = "gmt_create";

    public static final String COL_GMT_MODIFIED = "gmt_modified";
}