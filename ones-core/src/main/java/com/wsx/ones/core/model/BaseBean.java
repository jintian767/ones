package com.wsx.ones.core.model;

import java.io.Serializable;

public abstract class BaseBean implements Serializable {

	private static final long serialVersionUID = 6587263316959904903L;
	
	private String _id;

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}
}
