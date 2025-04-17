package com._7.bookinghospital.notification_service.application.response;

import java.time.LocalDateTime;
import java.util.UUID;

import com._7.bookinghospital.notification_service.domain.model.NotificationStatus;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class NotificationResponseDto {

	private UUID id;
	private String content;
	private LocalDateTime reservationTime;
	private LocalDateTime sendTime;
	private String channel;
	private NotificationStatus status;
	private Long userId;
}
