package com.huishu.file.FileServer.controller;

import com.huishu.file.FileServer.common.AjaxResult;

/**
 * 
 * 
 * @author yindq
 * @date 2017年11月8日
 */
public abstract class BaseController {
	public AjaxResult success(Object data) {
		return new AjaxResult().setData(data).setSuccess(true).setStatus(0);
	}

	public AjaxResult error(String message) {
		return new AjaxResult().setMessage(message).setSuccess(false).setStatus(1);
	}
}
