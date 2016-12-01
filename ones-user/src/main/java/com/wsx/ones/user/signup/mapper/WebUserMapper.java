package com.wsx.ones.user.signup.mapper;

import java.util.List;

import com.wsx.ones.user.signup.model.WebUser;

public interface WebUserMapper {

	public Integer saveWebUser(WebUser user);

	public WebUser getWebUserByID(String userId);

	public List<WebUser> findByWebUserIds(List<String> ids);

}
