package com.saf.app.lostpet.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;
import com.saf.app.action.Action;
import com.saf.app.action.ActionForward;
import com.saf.app.lostpet.dao.FilesDAO;
import com.saf.app.lostpet.dao.LostPetDAO;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;
import com.saf.app.lostpet.vo.LostPetVO;

public class LostPetWriteOk implements Action {

	@Override
	public ActionForward execute(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		
		String uploadFolder = "C:\\aigb_0900_ksy\\1team_image";
		int fileSize = 1024 * 1024 * 5;//5M
		LostPetDAO lpDao = new LostPetDAO();
		FilesDAO fDao = new FilesDAO();
		LostPetVO lostpet = new LostPetVO();
		ActionForward af = new ActionForward();
		
		//요청객체, 업로드폴더 경로, 파일의 크기, 인코딩 방식, 이름변경정책
		MultipartRequest multi = new MultipartRequest(req, uploadFolder, fileSize, "UTF-8", new DefaultFileRenamePolicy());
		
		lostpet.setLparea1(multi.getParameter("lparea1"));
		lostpet.setLparea2(multi.getParameter("lparea2"));
		lostpet.setLparea3(multi.getParameter("lparea3"));
		lostpet.setLpspecies(multi.getParameter("lpspecies"));
		lostpet.setLpgender(multi.getParameter("lpgender"));
		lostpet.setLpcolor(multi.getParameter("lpcolor"));
		lostpet.setLpbreed(multi.getParameter("lpbreed"));
		lostpet.setLptime(multi.getParameter("lptime"));
		lostpet.setLpcontent(multi.getParameter("lpcontent"));
		
		//게시글 추가
		lpDao.insert(lostpet);
		
		//파일 추가
		fDao.insert(multi, lpDao.getSeq());
		
		af.setRedirect(true);
		af.setPath(req.getContextPath() + "/lostpet/LostPetListOk.lo");
		
		return af;
	}

}
