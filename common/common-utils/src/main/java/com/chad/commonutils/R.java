package com.chad.commonutils;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class R {
	
	
	@ApiModelProperty("响应码")
	private Integer code;
	
	@ApiModelProperty("返回信息")
	private String msg;
	
	@ApiModelProperty("返回数据")
	private Map<String, Object> data = new HashMap<String, Object>();
	
	//无参构造方法私有
	private R() {
	}
	
	//成功 静态方法
	public static R ok() {
		R r = new R();
		r.setCode(ResultCodeEnum.SUCCESS.getCode());
		r.setMsg("成功。。。");
		return r;
	}
	
	//失败 静态方法
	public static R error() {
		R r = new R();
		r.setCode(ResultCodeEnum.ERROR.getCode());
		r.setMsg("失败");
		return r;
	}
	
	public R success(Boolean success) {
		return this;
	}
	
	public R code(Integer code) {
		this.setCode(code);
		return this;
	}
	
	public R message(String message) {
		return this;
	}
	
	public R data(String key, Object value) {
		this.data.put(key, value);
		return this;
	}
	
	public R data(Map<String, Object> map) {
		this.setData(map);
		return this;
	}
	
}
