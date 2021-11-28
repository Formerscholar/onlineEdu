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
    * 课程视频
    */
@ApiModel(value="课程视频")
@Data
@TableName(value = "guli_edu.edu_video")
public class Video {
    /**
     * 视频ID
     */
    @TableId(value = "id", type = IdType.ASSIGN_UUID)
    @ApiModelProperty(value="视频ID")
    private String id;

    /**
     * 课程ID
     */
    @TableField(value = "course_id")
    @ApiModelProperty(value="课程ID")
    private String course_id;

    /**
     * 章节ID
     */
    @TableField(value = "chapter_id")
    @ApiModelProperty(value="章节ID")
    private String chapter_id;

    /**
     * 节点名称
     */
    @TableField(value = "title")
    @ApiModelProperty(value="节点名称")
    private String title;

    /**
     * 云端视频资源
     */
    @TableField(value = "video_source_id")
    @ApiModelProperty(value="云端视频资源")
    private String video_source_id;

    /**
     * 原始文件名称
     */
    @TableField(value = "video_original_name")
    @ApiModelProperty(value="原始文件名称")
    private String video_original_name;

    /**
     * 排序字段
     */
    @TableField(value = "sort")
    @ApiModelProperty(value="排序字段")
    private Integer sort;

    /**
     * 播放次数
     */
    @TableField(value = "play_count")
    @ApiModelProperty(value="播放次数")
    private Long play_count;

    /**
     * 是否可以试听：0收费 1免费
     */
    @TableField(value = "is_free")
    @ApiModelProperty(value="是否可以试听：0收费 1免费")
    private Boolean is_free;

    /**
     * 视频时长（秒）
     */
    @TableField(value = "duration")
    @ApiModelProperty(value="视频时长（秒）")
    private Double duration;

    /**
     * Empty未上传 Transcoding转码中  Normal正常
     */
    @TableField(value = "`status`")
    @ApiModelProperty(value="Empty未上传 Transcoding转码中  Normal正常")
    private String status;

    /**
     * 视频源文件大小（字节）
     */
    @TableField(value = "`size`")
    @ApiModelProperty(value="视频源文件大小（字节）")
    private Long size;

    /**
     * 乐观锁
     */
    @TableField(value = "version")
    @ApiModelProperty(value="乐观锁")
    private Long version;

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

    public static final String COL_CHAPTER_ID = "chapter_id";

    public static final String COL_TITLE = "title";

    public static final String COL_VIDEO_SOURCE_ID = "video_source_id";

    public static final String COL_VIDEO_ORIGINAL_NAME = "video_original_name";

    public static final String COL_SORT = "sort";

    public static final String COL_PLAY_COUNT = "play_count";

    public static final String COL_IS_FREE = "is_free";

    public static final String COL_DURATION = "duration";

    public static final String COL_STATUS = "status";

    public static final String COL_SIZE = "size";

    public static final String COL_VERSION = "version";

    public static final String COL_GMT_CREATE = "gmt_create";

    public static final String COL_GMT_MODIFIED = "gmt_modified";
}