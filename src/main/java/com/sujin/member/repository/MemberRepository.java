package com.sujin.member.repository;

import org.springframework.stereotype.Repository;

import com.sujin.member.domain.Member;
import com.sujin.member.dto.request.MemberSaveRequest;
import com.sujin.member.repository.mapper.MemberMapper;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class MemberRepository {
	
	private final MemberMapper memberMapper;

	public void memberSave(Member member) {
		// TODO Auto-generated method stub
		memberMapper.memberSave(member);
	}

	public Member findByMail(String memberMail) {
		// TODO Auto-generated method stub
		return memberMapper.findByMail(memberMail);
	}
	
}
