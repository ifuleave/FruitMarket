package com.sujin.member.dto.response;

import com.sujin.member.domain.Member;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemberOneResponse {

	private Long memberId;
	private String memberMail;
	private String memberName;
	private String memberAddress;
	
	@Builder
	public MemberOneResponse(Long memberId, String memberMail, String memberName, String memberAddress) {
		this.memberId = memberId;
		this.memberMail = memberMail;
		this.memberName = memberName;
		this.memberAddress = memberAddress;
	}
	
	public static Member toMember(MemberOneResponse response) {
		return Member.builder()
				.memberId(response.getMemberId())
				.memberName(response.getMemberName())
				.memberMail(response.getMemberMail())
				.memberAddress(response.getMemberAddress())
				.build();
				
	}
	
	public static MemberOneResponse of(Member member) {
		return MemberOneResponse.builder()
				.memberId(member.getMemberId())
				.memberName(member.getMemberName())
				.memberMail(member.getMemberMail())
				.memberAddress(member.getMemberAddress())
				.build();
	}
	
	
}
