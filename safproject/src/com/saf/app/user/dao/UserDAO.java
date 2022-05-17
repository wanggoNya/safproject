package com.saf.app.user.dao;

import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.boardMVC.app.member.vo.MemberVO;
import com.boardMVC.mybatis.config.MyBatisConfig;

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
	public void join(UserVO member) {
		sqlSession.insert("User.join", user);
	}
	
	//로그인
	public int login(Map<String, String> loginMap) {
		int memberNumber = 0;
		try {memberNumber = sqlSession.selectOne("User.login", loginMap);} catch (Exception e) {;}
		return memberNumber;
	}
	
	//회원 정보 조회
	public UserVO getInfo(int userNumber) {
		return sqlSession.selectOne("User.getInfo", userNumber);
	}
	
}












