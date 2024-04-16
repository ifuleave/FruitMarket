package com.sujin.member.dto.request;

import com.sujin.member.domain.Member;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
public class MemberSaveRequest {
	
	private String memberEmail;
	private String memberName;
	private String memberAddress;
	
	
	public MemberSaveRequest(String memberEmail, String memberName, String memberAddress) {
		
		this.memberEmail = memberEmail;
		this.memberName = memberName;
		this.memberAddress = memberAddress;
	}
	
// 정적 팩토리 메소드
	
	public static  Member toMember(MemberSaveRequest request) {
		return Member.builder()
				.memberEmail(request.getMemberEmail())
				.memberName(request.getMemberName())
				.memberAddress(request.getMemberAddress())
				.build();
	}
	
	
		
}
