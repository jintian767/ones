package com.wsx.ones.user.signup.dao;

import java.util.List;

import com.wsx.ones.user.signup.model.User;
import com.wsx.ones.user.signup.model.WebUser;

public interface UserSignupDao {

	public boolean saveUser(User user);
	
	public List<User> findAllUsers();
	
	public List<User> findByUserByIds(List<Integer> userIds);

	public boolean saveWebUser(WebUser user);

	public WebUser getWebUserByID(String userId);

	public List<WebUser> findByWebUserByIds(List<String> ids);
}
