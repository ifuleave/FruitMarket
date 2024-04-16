package com.sujin.member.dto.response;

import com.sujin.member.domain.Member;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemberOneResponse {

	private Long memberId;
	private String memberEmail;
	private String memberName;
	private String memberAddress;
	
	@Builder
	public MemberOneResponse(Long memberId, String memberEmail, String memberName, String memberAddress) {
		this.memberId = memberId;
		this.memberEmail = memberEmail;
		this.memberName = memberName;
		this.memberAddress = memberAddress;
	}
	
	public static Member toMember(MemberOneResponse response) {
		return Member.builder()
				.memberId(response.getMemberId())
				.memberName(response.getMemberName())
				.memberEmail(response.getMemberEmail())
				.memberAddress(response.getMemberAddress())
				.build();
				
	}
	
	public static MemberOneResponse of(Member member) {
		return MemberOneResponse.builder()
				.memberId(member.getMemberId())
				.memberName(member.getMemberName())
				.memberEmail(member.getMemberEmail())
				.memberAddress(member.getMemberAddress())
				.build();
	}
	
	
}
