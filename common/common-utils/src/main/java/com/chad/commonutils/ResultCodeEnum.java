package com.chad.commonutils;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ResultCodeEnum {
	SUCCESS(200, "success"),
	ERROR(500, "error");
	private Integer code;
	private String msg;
}
