package com._7.bookinghospital.notification_service.presentation.controller;

import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com._7.bookinghospital.notification_service.application.response.NotificationResponseDto;
import com._7.bookinghospital.notification_service.presentation.request.NotificationRequestDto;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/notifications")
@RequiredArgsConstructor
public class NotificationController {

	@PostMapping
	public ResponseEntity<NotificationResponseDto> createNotification(
		@RequestBody NotificationRequestDto request) {

		return ResponseEntity.status(HttpStatus.CREATED).body(null);
	}

	@GetMapping("/{notificationId}")
	public ResponseEntity<NotificationResponseDto> getNotification(
		@PathVariable UUID notificationId) {

		return ResponseEntity.status(HttpStatus.OK).body(null);
	}

	@DeleteMapping("/{notificationId}")
	public ResponseEntity<String> deleteNotification(
		@PathVariable UUID notificationId) {

		return ResponseEntity.ok("정상적으로 삭제 되었습니다.");
	}
}
