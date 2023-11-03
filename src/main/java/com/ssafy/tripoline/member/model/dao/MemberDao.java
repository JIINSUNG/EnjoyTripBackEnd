package com.ssafy.tripoline.member.model.dao;

import java.sql.SQLException;

import org.apache.ibatis.annotations.Mapper;

import com.ssafy.tripoline.member.model.dto.Member;

@Mapper
public interface MemberDao {

	void regist(Member member) throws SQLException; 	// 회원가입
	void update(Member member) throws SQLException; 	// 회원정보 수정
	void remove(String memberId) throws SQLException; 	// 회원탈퇴
	int search(String memeberId) throws SQLException; 	// 회원조회
	Member login(String memberId, String memberPassword) throws SQLException; 	// 회원 로그인
	String findPassword(String memberId, String memberPhone) throws SQLException; 	// 회원 비밀번호 찾기
	
}