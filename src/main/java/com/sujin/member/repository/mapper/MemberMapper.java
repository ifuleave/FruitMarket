package com.sujin.member.repository.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.sujin.member.domain.Member;

@Mapper
public interface MemberMapper {

	void memberSave(Member member);

	Member findByMail(String memberEmail);

	List<Member> memberList();

	Member getUserId(Long memberId);

//	List<MemberOneResponse> memberList();

}
