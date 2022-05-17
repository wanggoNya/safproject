package com.saf.app.board.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.boardMVC.action.Action;
import com.boardMVC.action.ActionForward;
import com.boardMVC.app.member.dao.MemberDAO;

public class BoardWrite implements Action{
	@Override
	public ActionForward execute(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		
		HttpSession session = req.getSession();
		UserDAO mDao = new UserDAO();
		ActionForward af = new ActionForward();
		
		String userId = uDao.getInfo((Integer)session.getAttribute("userNumber")).getUserId();
		
		req.setAttribute("userId", userId);
		
		af.setRedirect(false);
		af.setPath("/app/board/boardWrite.jsp");
		
		return af;
	}
}




