package com.wsx.ones.user;

import com.wsx.ones.core.model.OutputData;

public class UserOutputData extends OutputData {

	private static final long serialVersionUID = 5912643633331737649L;
	private String token;
	
	public UserOutputData() {
		super();
	}

	public UserOutputData(int code, int status) {
		super(code, status);
	}
	
	
	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
}
