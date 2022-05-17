package com.saf.app.board.vo;

<<<<<<< HEAD
public class BoardReplyVO {
	private int replyNumber;
	private int boardNumber;
	private int userNumber;
	private String replyContent;
	
	public BoardReplyVO() {;}

	public int getReplyNumber() {
		return replyNumber;
	}

	public void setReplyNumber(int replyNumber) {
		this.replyNumber = replyNumber;
	}

	public int getBoardNumber() {
		return boardNumber;
	}

	public void setBoardNumber(int boardNumber) {
		this.boardNumber = boardNumber;
	}

	public int getUserNumber() {
		return userNumber;
	}

	public void setUserNumber(int userNumber) {
		this.userNumber = userNumber;
	}

	public String getReplyContent() {
		return replyContent;
	}

	public void setReplyContent(String replyContent) {
		this.replyContent = replyContent;
	}
=======
public class BoardReplyVO {private int rnumber;
private String rcontent;
private String rdate;
private int bnumber;

public int getRnumber() {
	return rnumber;
}
public void setRnumber(int rnumber) {
	this.rnumber = rnumber;
}
public String getRcontent() {
	return rcontent;
}
public void setRcontent(String rcontent) {
	this.rcontent = rcontent;
}
public String getRdate() {
	return rdate;
}
public void setRdate(String rdate) {
	this.rdate = rdate;
}
public int getBnumber() {
	return bnumber;
}
public void setBnumber(int bnumber) {
	this.bnumber = bnumber;
}

public BoardReplyVO() {
	
}

public BoardReplyVO(int rnumber, String rcontent, String rdate, int bnumber) {
	super();
	this.rnumber = rnumber;
	this.rcontent = rcontent;
	this.rdate = rdate;
	this.bnumber = bnumber;
}

>>>>>>> fc915e31173cf357fb98650ae1701470401923a5
}
