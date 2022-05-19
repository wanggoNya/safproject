package com.saf.app.user.vo;

public class UserVO {
<<<<<<< HEAD
	private int userNumber;
	private String userId;
	private String userPw;
	private String userName;
	private int userAge;
	private String userGender;
	private String userEmail;
	private String userZipcode;
	private String userAddress;
	private String userAddressDetail;
	
	public UserVO() {;}

	public int getUserNumber() {
		return userNumber;
	}

	public void setUserNumber(int userNumber) {
		this.userNumber = userNumber;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPw() {
		return userPw;
	}

	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getUserAge() {
		return userAge;
	}

	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}

	public String getUserGender() {
		return userGender;
	}

	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserZipcode() {
		return userZipcode;
	}

	public void setUserZipcode(String userZipcode) {
		this.userZipcode = userZipcode;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	public String getUserAddressDetail() {
		return userAddressDetail;
	}

	public void setUserAddressDetail(String userAddressDetail) {
		this.userAddressDetail = userAddressDetail;
	}
	
	@Override
	public String toString() {
		String str = "userNumber : " + userNumber + "\n";
		str += "userId : " + userId + "\n";
		str += "userPw : " + userPw + "\n";
		str += "userName : " + userName + "\n";
		str += "userAge : " + userAge + "\n";
		str += "userGender : " + userGender + "\n";
		str += "userEmail : " + userEmail + "\n";
		str += "userZipcode : " + userZipcode + "\n";
		str += "userAddress : " + userAddress + "\n";
		str += "userAddressDetail : " + userAddressDetail;
		return str;
	}
=======
	private int unum;
	private String uid;
	private String uphone;
	private String upw;
	private String uname;
	private String uaddr;
	private String uemail;
	
	public int getUnum() {
		return unum;
	}
	public void setUnum(int unum) {
		this.unum = unum;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getUphone() {
		return uphone;
	}
	public void setUphone(String uphone) {
		this.uphone = uphone;
	}
	public String getUpw() {
		return upw;
	}
	public void setUpw(String upw) {
		this.upw = upw;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUaddr() {
		return uaddr;
	}
	public void setUaddr(String uaddr) {
		this.uaddr = uaddr;
	}
	public String getUemail() {
		return uemail;
	}
	public void setUemail(String uemail) {
		this.uemail = uemail;
	}
	
	public UserVO() {
		
	}
	
	public UserVO(int unum, String uid, String uphone, String upw, String uname, String uaddr, String uemail) {
		super();
		this.unum = unum;
		this.uid = uid;
		this.uphone = uphone;
		this.upw = upw;
		this.uname = uname;
		this.uaddr = uaddr;
		this.uemail = uemail;
	}
	
>>>>>>> fc915e31173cf357fb98650ae1701470401923a5
}








