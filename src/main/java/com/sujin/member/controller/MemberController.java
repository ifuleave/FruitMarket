package com.sujin.member.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sujin.member.dto.request.MemberSaveRequest;
import com.sujin.member.dto.response.MemberOneResponse;
import com.sujin.member.service.MemberService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class MemberController {

	private final MemberService memberSerivce;

	@PostMapping("/api/members")
	public ResponseEntity<Void> memberSave(@RequestBody MemberSaveRequest request) {
		memberSerivce.memberSave(request);
		return ResponseEntity.ok().build();
	}

	@GetMapping("/api/members/list")
	public List<MemberOneResponse> memberList() {
		return memberSerivce.memberList();
	}
}
