package com._7.bookinghospital.notification_service.application.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com._7.bookinghospital.notification_service.application.response.NotificationResponseDto;
import com._7.bookinghospital.notification_service.domain.model.Notification;
import com._7.bookinghospital.notification_service.domain.repository.NotificationRepository;
import com._7.bookinghospital.notification_service.presentation.request.NotificationRequestDto;

import lombok.RequiredArgsConstructor;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class NotificationService {

	private final NotificationRepository notificationRepository;

	@Transactional
	public NotificationResponseDto createNotification(NotificationRequestDto request) {
		Notification newNotification = Notification.create(request);
		notificationRepository.save(newNotification);

		return NotificationResponseDto.from(newNotification);
	}
}
