package com.sujin.member.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sujin.member.dto.request.MemberSaveRequest;
import com.sujin.member.service.MemberService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class MemberController {

	private final MemberService memberSerivce; 
	
		@PostMapping("/api/users")
		public ResponseEntity<Void> memberSave(@RequestBody MemberSaveRequest request) {
			memberSerivce.memberSave(request);
			return ResponseEntity.ok().build();
		}
}
