package com.sujin.member.domain;

import lombok.Builder;
import lombok.Getter;


@Getter
public class Member {
	
	private Long memberId;			
	private String memberMail;		
	private String memberName;		
	private String memberAddress;
	
	@Builder
	public Member( String memberMail, String memberName, String memberAddress) {

		this.memberMail = memberMail;
		this.memberName = memberName;
		this.memberAddress = memberAddress;
	}

	@Builder
	public Member(Long memberId, String memberMail, String memberName, String memberAddress) {
		this.memberId = memberId;
		this.memberMail = memberMail;
		this.memberName = memberName;
		this.memberAddress = memberAddress;
	}
	
	
	
}
