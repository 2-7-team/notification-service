package com._7.bookinghospital.notification_service.domain.model;

import java.time.LocalDateTime;
import java.util.UUID;

import com._7.bookinghospital.notification_service.presentation.request.NotificationRequestDto;

import bookinghospital.common_module.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "p_notification")
public class Notification extends BaseEntity {

	@Builder
	public Notification(String content,
		LocalDateTime reservationTime,
		LocalDateTime sendTime,
		String channel,
		String errorMessage,
		Integer retryCount,
		NotificationStatus status,
		Long userId) {
		this.content = content;
		this.reservationTime = reservationTime;
		this.sendTime = sendTime;
		this.channel = channel;
		this.errorMessage = errorMessage;
		this.retryCount = retryCount;
		this.status = status;
		this.userId = userId;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID id;

	@Column
	private String content;

	@Column
	private LocalDateTime reservationTime;

	@Column
	private LocalDateTime sendTime;

	@Column
	private String channel;

	@Column
	private String errorMessage;

	@Column
	private Integer retryCount;

	@Column
	@Enumerated(EnumType.STRING)
	private NotificationStatus status = NotificationStatus.PENDING;

	@Column
	private Long userId;

	public static Notification create(NotificationRequestDto request) {
		return Notification.builder()
			.content(request.getContent())
			.reservationTime(request.getReservationTime())
			.sendTime(request.getSendTime())
			.channel(request.getChannel())
			.errorMessage("")
			.retryCount(0)
			.status(NotificationStatus.PENDING)
			.userId(request.getUserId())
			.build();
	}
}
