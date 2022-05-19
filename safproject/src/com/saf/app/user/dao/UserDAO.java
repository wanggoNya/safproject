package com.saf.app.user.dao;

import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.saf.app.user.vo.UserVO;
import com.saf.mybatis.config.MyBatisConfig;

public class UserDAO {
	SqlSessionFactory sqlSessionFactory = MyBatisConfig.getSqlsessoinFactory();
	SqlSession sqlSession;
	
	public UserDAO() {
		sqlSession = sqlSessionFactory.openSession(true);
	}


	// 아이디 중복 검사
	public boolean checkId(String uid) {
		return (Integer) sqlSession.selectOne("User.checkId", uid) == 1;

	}
	
	//회원가입
	public void join(UserVO user) {
		sqlSession.insert("User.join", user);
	}

	//로그인

	public int login(Map<String, String> loginMap) {
		int userNumber = 0;
		try {userNumber = sqlSession.selectOne("User.login", loginMap);} catch (Exception e) {;}
		return userNumber;
	}

<<<<<<< HEAD
	// 회원정보조회
=======
	
	//회원 정보 조회

>>>>>>> 0151a3b97829a76b09623939f48315133d153c7f
	public UserVO getInfo(int userNumber) {
		return sqlSession.selectOne("User.getInfo", userNumber);
	}
	
}

<<<<<<< HEAD
	// 프로필수정
=======








	// 프로필 수정
>>>>>>> 0151a3b97829a76b09623939f48315133d153c7f
	public void updateUserProfile(UserVO user) {
		sqlSession.update("User.updateUserProfile", user);
	}

<<<<<<< HEAD
	// 회원정보수정
=======
	// 회원 정보 수정
>>>>>>> 0151a3b97829a76b09623939f48315133d153c7f
	public void updateUser(UserVO user) {
		sqlSession.update("User.updateUser", user);
	}

<<<<<<< HEAD
	// 비밀번호변경
=======
	// 비밀번호 변경
>>>>>>> 0151a3b97829a76b09623939f48315133d153c7f
	public void updateUpw(UserVO user) {
		sqlSession.update("User.updateUser", user);
	}

<<<<<<< HEAD
	// 회원탈퇴
=======
	// 회원 탈퇴
>>>>>>> 0151a3b97829a76b09623939f48315133d153c7f
	public void delUser(UserVO user) {
		sqlSession.update("User.updateUser", user);
	}


