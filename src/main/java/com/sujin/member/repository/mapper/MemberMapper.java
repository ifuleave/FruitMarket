package com.sujin.member.repository.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.sujin.member.domain.Member;
import com.sujin.member.dto.response.MemberOneResponse;


@Mapper
public interface MemberMapper {

	void memberSave(Member member);

	Member findByMail(String memberMail);

	List<Member> memberList();
	
//	List<MemberOneResponse> memberList();

}
