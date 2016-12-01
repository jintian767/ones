package com.wsx.ones.core.model;

import java.io.Serializable;

import com.wsx.ones.core.controller.WebController;

public class OutputData implements Serializable {

private static final long serialVersionUID = 2991624475301186743L;
	
	private int code = WebController.STATUS_SUCCESS;
	private int status = WebController.CODE_SUCCESS;
	
	public OutputData() {
		super();
	}
	public OutputData(int code, int status) {
		this.code = code;
		this.status = status;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
}
