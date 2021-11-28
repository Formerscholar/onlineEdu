package com.chad.eduservice.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
public class BaseEntity {
	
	/**
	 * ID
	 */
	@TableId(value = "id", type = IdType.ASSIGN_UUID)
	@ApiModelProperty(value = "ID")
	private String id;
	
	
	/**
	 * 逻辑删除 1（true）已删除， 0（false）未删除
	 */
	@ApiModelProperty(value = "逻辑删除 1（true）已删除， 0（false）未删除")
	@TableLogic
	@TableField(value = "is_deleted")
	private Integer is_deleted;
	
	/**
	 * 创建时间
	 */
	@ApiModelProperty(value = "创建时间")
	@TableField(value = "gmt_create")
	private String gmt_create;
	
	/**
	 * 更新时间
	 */
	@ApiModelProperty(value = "更新时间")
	@TableField(value = "gmt_modified")
	private Date gmt_modified;
}
