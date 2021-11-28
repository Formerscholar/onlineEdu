package com.chad.eduservice.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 讲师
 */
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "讲师")
@Data
@TableName(value = "guli_edu.edu_teacher")
public class Teacher extends BaseEntity {
	
	/**
	 * 讲师姓名
	 */
	@TableField(value = "`name`")
	@ApiModelProperty(value = "讲师姓名")
	private String name;
	
	/**
	 * 讲师简介
	 */
	@TableField(value = "intro")
	@ApiModelProperty(value = "讲师简介")
	private String intro;
	
	/**
	 * 讲师资历,一句话说明讲师
	 */
	@TableField(value = "career")
	@ApiModelProperty(value = "讲师资历,一句话说明讲师")
	private String career;
	
	/**
	 * 头衔 1高级讲师 2首席讲师
	 */
	@TableField(value = "`level`")
	@ApiModelProperty(value = "头衔 1高级讲师 2首席讲师")
	private Integer level;
	
	/**
	 * 讲师头像
	 */
	@TableField(value = "avatar")
	@ApiModelProperty(value = "讲师头像")
	private String avatar;
	
	/**
	 * 排序
	 */
	@TableField(value = "sort")
	@ApiModelProperty(value = "排序")
	private Integer sort;
	
	
}