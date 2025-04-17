package com._7.bookinghospital.notification_service.presentation.request;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class NotificationRequestDto {

	private String content;
	private LocalDateTime reservationTime;
	private LocalDateTime sendTime;
	private String channel;
	private Long userId;
}
