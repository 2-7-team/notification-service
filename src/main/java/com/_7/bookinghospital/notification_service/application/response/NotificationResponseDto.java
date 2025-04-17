package com._7.bookinghospital.notification_service.application.response;

import java.time.LocalDateTime;
import java.util.UUID;

import com._7.bookinghospital.notification_service.domain.model.Notification;
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

	public static NotificationResponseDto from(Notification	notification) {

		return NotificationResponseDto.builder()
			.id(notification.getId())
			.content(notification.getContent())
			.reservationTime(notification.getReservationTime())
			.sendTime(notification.getSendTime())
			.channel(notification.getChannel())
			.status(notification.getStatus())
			.userId(notification.getUserId())
			.build();
	}
}
