package com.sujin.member.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.sujin.member.domain.Member;
import com.sujin.member.dto.request.MemberSaveRequest;
import com.sujin.member.dto.response.MemberOneResponse;
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

	public Member findByMail(String memberEmail) {
		// TODO Auto-generated method stub
		return memberMapper.findByMail(memberEmail);
	}

	public List<Member> memberList() {
		// TODO Auto-generated method stub
		return memberMapper.memberList();
	}

	public Member getUserId(Long memberId) {
		// TODO Auto-generated method stub
		return memberMapper.getUserId(memberId);
	}
	
//	public List<MemberOneResponse> memberList() {
//		// TODO Auto-generated method stub
//		return memberMapper.memberList();
//	}
}
