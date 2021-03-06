package com.wsx.ones.user.login;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wsx.ones.core.controller.WebController;
import com.wsx.ones.user.UserBaseController;
import com.wsx.ones.user.login.model.LoginUser;

@RestController
@Scope("prototype")
public class UserLoginController extends UserBaseController {

	@RequestMapping(
			value = "/user/login/nm",
			method = {RequestMethod.POST}
	)
	public String userLogin(LoginUser user, HttpServletRequest request, HttpServletResponse response) {
		
		//
		int cliCode = checkLogin(user);
		if (cliCode != WebController.STATUS_SUCCESS) {
			return "";
		}
		
		//
		reconstructPasswd(user, true);
		
		//
		return "";
	}


}
