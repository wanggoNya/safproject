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

	// 회원가입
	public void join(UserVO user) {
		sqlSession.insert("User.join", user);
	}

	// 濡쒓렇�씤
	public int login(Map<String, String> loginMap) {
		int userNumber = 0;
		try {
			userNumber = sqlSession.selectOne("User.login", loginMap);
		} catch (Exception e) {
			;
		}
		return userNumber;
	}

	// �쉶�썝 �젙蹂� 議고쉶
	public UserVO getInfo(int userNumber) {
		return sqlSession.selectOne("User.getInfo", userNumber);
	}

	// �봽濡쒗븘 蹂�寃�
	public void updateUserProfile(UserVO user) {
		sqlSession.update("User.updateUserProfile", user);
	}

	// �쉶�썝 �젙蹂� �닔�젙
	public void updateUser(UserVO user) {
		sqlSession.update("User.updateUser", user);
	}

	// 鍮꾨�踰덊샇 蹂�寃�
	public void updateUpw(UserVO user) {
		sqlSession.update("User.updateUser", user);
	}

	// �쉶�썝 �깉�눜
	public void delUser(UserVO user) {
		sqlSession.update("User.updateUser", user);
	}

}
