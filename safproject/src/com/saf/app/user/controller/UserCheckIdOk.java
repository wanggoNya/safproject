package com.saf.app.user.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONObject;

import com.saf.app.action.Action;
import com.saf.app.action.ActionForward;
import com.saf.app.user.dao.UserDAO;

public class UserCheckIdOk implements Action{

	@Override
	public com.saf.app.action.ActionForward execute(HttpServletRequest req, HttpServletResponse resp) throws IOException{
		
		String uId = req.getParameter("uId");
		UserDAO dao = new UserDAO();
		PrintWriter out = resp.getWriter();
		JSONObject obj = new JSONObject();
		
		if(dao.checkId(uId)) {
			//아이디가 중복되었을 때
//			out.print("not-ok");
			obj.put("status", "not-ok");
		}else {
			//사용 가능한 아이디일 때
//			out.print("ok");
			obj.put("status", "ok");
		}
		
		out.print(obj.toJSONString());
		out.close();
		
		return null;
	}
}
