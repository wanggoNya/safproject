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
	
	//아이디 중복검사
	public boolean checkId(String userId) {
		return (Integer)sqlSession.selectOne("User.checkId", userId) == 1;
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
	
	//회원 정보 조회
	public UserVO getInfo(int userNumber) {
		return sqlSession.selectOne("User.getInfo", userNumber);
	}
	
}












