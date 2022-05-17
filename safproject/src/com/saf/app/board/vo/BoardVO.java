package com.saf.app.board.vo;

public class BoardVO {
<<<<<<< HEAD
	private int boardNumber;
	private String boardTitle;
	private String boardContent;
	private int userNumber;
	private String boardDate;
	private int readCount;
=======
	private int bnumber;
	private String btitle;
	private String bcontent;
	private String bdate;
	private int unum;
	private String bimage;
	public int getBnumber() {
		return bnumber;
	}
	public void setBnumber(int bnumber) {
		this.bnumber = bnumber;
	}
	public String getBtitle() {
		return btitle;
	}
	public void setBtitle(String btitle) {
		this.btitle = btitle;
	}
	public String getBcontent() {
		return bcontent;
	}
	public void setBcontent(String bcontent) {
		this.bcontent = bcontent;
	}
	public String getBdate() {
		return bdate;
	}
	public void setBdate(String bdate) {
		this.bdate = bdate;
	}
	public int getUnum() {
		return unum;
	}
	public void setUnum(int unum) {
		this.unum = unum;
	}
	public String getBimage() {
		return bimage;
	}
	public void setBimage(String bimage) {
		this.bimage = bimage;
	}
>>>>>>> fc915e31173cf357fb98650ae1701470401923a5
	
	public BoardVO() {
		
	}
	
	public BoardVO(int bnumber, String btitle, String bcontent, String bdate, int unum, String bimage) {
		super();
		this.bnumber = bnumber;
		this.btitle = btitle;
		this.bcontent = bcontent;
		this.bdate = bdate;
		this.unum = unum;
		this.bimage = bimage;
	}
<<<<<<< HEAD

	public String getBoardTitle() {
		return boardTitle;
	}

	public void setBoardTitle(String boardTitle) {
		this.boardTitle = boardTitle;
	}

	public String getBoardContent() {
		return boardContent;
	}

	public void setBoardContent(String boardContent) {
		this.boardContent = boardContent;
	}

	public int getUserNumber() {
		return userNumber;
	}

	public void setUserNumber(int userNumber) {
		this.userNumber = userNumber;
	}

	public String getBoardDate() {
		return boardDate;
	}

	public void setBoardDate(String boardDate) {
		this.boardDate = boardDate;
	}

	public int getReadCount() {
		return readCount;
	}

	public void setReadCount(int readCount) {
		this.readCount = readCount;
	}
}
=======
	
}
>>>>>>> fc915e31173cf357fb98650ae1701470401923a5
