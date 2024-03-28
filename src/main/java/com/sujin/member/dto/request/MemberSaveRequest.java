package com.sujin.member.dto.request;

import com.sujin.member.domain.Member;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class MemberSaveRequest {
	
	private String memberMail;
	private String memberName;
	private String memberAddress;
	
	
	public MemberSaveRequest(String memberMail, String memberName, String memberAddress) {
		
		this.memberMail = memberMail;
		this.memberName = memberName;
		this.memberAddress = memberAddress;
	}
	
// 정적 팩토리 메소드
	
	public static Member toMember(MemberSaveRequest request) {
		return Member.builder()
				.memberMail(request.getMemberMail())
				.memberName(request.getMemberName())
				.memberAddress(request.getMemberAddress())
				.build();
	}
	
	
		
}
