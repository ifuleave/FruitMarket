package com.sujin.member.domain;

import lombok.Builder;
import lombok.Getter;


@Getter
public class Member {
	
	private Long memberId;			
	private String memberEmail;		
	private String memberName;		
	private String memberAddress;
	
	@Builder
	public Member( String memberEmail, String memberName, String memberAddress) {

		this.memberEmail = memberEmail;
		this.memberName = memberName;
		this.memberAddress = memberAddress;
	}

	@Builder
	public Member(Long memberId, String memberEmail, String memberName, String memberAddress) {
		this.memberId = memberId;
		this.memberEmail = memberEmail;
		this.memberName = memberName;
		this.memberAddress = memberAddress;
	}
	
	
	
}
