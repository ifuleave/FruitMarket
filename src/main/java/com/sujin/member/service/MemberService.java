package com.sujin.member.service;

import java.util.ArrayList;
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
		
		Member m = memberRepository.findByMail(request.getMemberEmail());
		
		 if(m != null) {
			 throw new IllegalArgumentException("중복된 이메일 입니다.");
		 }
		
		Member member = MemberSaveRequest.toMember(request);
		
		memberRepository.memberSave(member);
	}
	
//	@Transactional
//	public Member memberSave(MemberSaveRequest request) {
//		// TODO Auto-generated method stub
//		Member m  = memberRepository.findByMail(request.getMemberMail());
//		if (m != null) {
//			throw new IllegalArgumentException("중복된 이메일 입니다.");
//		} 
//		
//		Member member = new Member(request.getMemberMail(), request.getMemberName(), request.getMemberAddress());
//		
//		return member;
//	}
	
	 public List<MemberOneResponse> memberList() {
	      // TODO Auto-generated method stub
	      List<Member> members = memberRepository.memberList();
	      
//	      return members.stream()
//	            .map(MemberOneResponse::of)
//	            .toList();
	         List<MemberOneResponse> list = new ArrayList<>();
	         
	         for(int i=0; i < members.size();i++) {
//	            MemberOneResponse mor = new MemberOneResponse();
//	            mor.setMemberId(member.get(i).getMemberId());
//	            mor.setMemberName(member.get(i).getMemberName());
//	            mor.setMemberMail(member.get(i).getMemberMail());
//	            mor.setMemberAddress(member.get(i).getMemberAddress());
//	            list.add(mor);
	            
	            MemberOneResponse memberOne = MemberOneResponse.of(members.get(i));
	            list.add(memberOne);
	         } 
	         return list;
	   }

	
//	public List<MemberOneResponse> memberList() {
//		// TODO Auto-generated method stub
//		return memberRepository.memberList();
//	}


}
