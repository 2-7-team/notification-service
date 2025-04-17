package com._7.bookinghospital.notification_service.domain.model;

import java.time.LocalDateTime;
import java.util.UUID;

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
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "p_notification")
public class Notification extends BaseEntity {

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
	private String errorMessage = "";

	@Column
	private Integer retryCount = 0;

	@Column
	@Enumerated(EnumType.STRING)
	private NotificationStatus status = NotificationStatus.PENDING;

	@Column
	private Long userId;
}
