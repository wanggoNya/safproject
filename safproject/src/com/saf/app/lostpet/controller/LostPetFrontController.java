package com.saf.app.lostpet.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.boardMVC.action.ActionForward;

public class LostPetFrontController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
	}

	protected void doProcess(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String requestURI = req.getRequestURI();
		String contextPath = req.getContextPath();
		String command = requestURI.substring(contextPath.length());
		ActionForward af = null;
		
		switch(command) {
		case "/board/BoardListOk.bo":
			af = new LostPetListOk().execute(req, resp);
			break;
		case "/board/BoardDetailOk.bo":
			af = new LostPetDetailOk().execute(req, resp);
			break;
		case "/board/BoardWrite.bo":
			af = new LostPetWrite().execute(req, resp);
			break;
		case "/board/BoardWriteOk.bo":
			af = new LostPetWriteOk().execute(req, resp);
			break;
		case "/board/BoardDeleteOk.bo":
			af = new LostPetDeleteOk().execute(req, resp);
			break;
		case "/board/BoardUpdate.bo":
			af = new LostPetUpdate().execute(req, resp);
			break;
		case "/board/BoardUpdateOk.bo":
			af = new LostPetUpdateOk().execute(req, resp);
			break;
		case "/board/FileDownloadOk.bo":
			af = new FileDownloadOk().execute(req, resp);
			break;
		case "/board/BoardReplyListOk.bo":
			new LostPetReplyListOk().execute(req, resp);
			break;
		case "/board/BoardReplyWriteOk.bo":
			new LostPetReplyWriteOk().execute(req, resp);
			break;
		case "/board/BoardReplyDeleteOk.bo":
			new LostPetReplyDeleteOk().execute(req, resp);
			break;
		case "/board/BoardReplyUpdateOk.bo":
			new LostPetReplyUpdateOk().execute(req, resp);
			break;
		}
		
		//분기 별 결과를 af에 담았다면 여기로 내려온다.
		
		if(af != null) {// af가 null이 아니라면
			if(af.isRedirect()) {//redirect 방식이라면
				resp.sendRedirect(af.getPath());//redirect로 전송
				
			}else {//forward 방식이라면
				RequestDispatcher dispatcher = req.getRequestDispatcher(af.getPath());
				dispatcher.forward(req, resp);//forward로 전송
			}
		}
	}
}















