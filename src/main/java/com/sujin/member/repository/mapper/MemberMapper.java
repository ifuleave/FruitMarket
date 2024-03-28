package com.sujin.member.repository.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.sujin.member.domain.Member;


@Mapper
public interface MemberMapper {

	void memberSave(Member member);

	Member findByMail(String memberMail);

}
