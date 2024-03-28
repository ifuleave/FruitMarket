package com.sujin.member.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sujin.member.domain.Member;
import com.sujin.member.dto.request.MemberSaveRequest;
import com.sujin.member.dto.response.MemberOneResponse;
import com.sujin.member.repository.MemberRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class MemberService {
		
	private final MemberRepository memberRepository;
	
	@Transactional
	public void memberSave(MemberSaveRequest request) {
		
		Member m = memberRepository.findByMail(request.getMemberMail());
		
		 if(m != null) {
			 throw new IllegalArgumentException("중복된 이메일 입니다.");
		 }
		
		Member member = MemberSaveRequest.toMember(request);
		
		memberRepository.memberSave(member);
	}

	public List<MemberOneResponse> memberList() {
		// TODO Auto-generated method stub
		List<Member> members = memberRepository.memberList();
		return members.stream()
			   .map(MemberOneResponse::of)
			   .toList();
		
		// 숙제 for문 바꿔보기
	}
}
