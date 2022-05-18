package com.saf.app.user.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.saf.app.action.Action;
import com.saf.app.action.ActionForward;
import com.saf.app.user.dao.UserDAO;
import com.saf.app.user.vo.UserVO;

public class UserJoinOk implements Action{

	@Override
	public ActionForward execute(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		req.setCharacterEncoding("UTF-8");
		
		ActionForward af = new ActionForward();
		UserVO user = new UserVO();
		UserDAO dao = new UserDAO();
		
		
		user.setUnum(Integer(req.getParameter("uNum")));
		user.setUid(req.getParameter("uid"));
		user.setUphone(req.getParameter("uphone"));
		user.setUpw(req.getParameter("userPw"));
		user.setUname(req.getParameter("userName"));
		user.setUaddr(req.getParameter("uaddr"));
		user.setUemail(req.getParameter("uemail"));
		
		dao.join(user);
		
		af.setRedirect(true);
		//redirect로 전송할 때 contextPath가 사라지기 때문에
		//미리 붙여놓고 전송한다.
		af.setPath(req.getContextPath() + "/user/UserLogin.me");
		
		return af;
	}

	private int Integer(String parameter) {
		// TODO Auto-generated method stub
		return 0;
	}
}
