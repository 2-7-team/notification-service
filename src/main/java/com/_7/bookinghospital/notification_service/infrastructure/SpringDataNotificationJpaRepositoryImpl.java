package com._7.bookinghospital.notification_service.infrastructure;

import java.util.UUID;

import org.springframework.stereotype.Repository;

import com._7.bookinghospital.notification_service.domain.model.Notification;
import com._7.bookinghospital.notification_service.domain.repository.NotificationRepository;
import com._7.bookinghospital.notification_service.infrastructure.jpa.NotificationJpaRepository;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class SpringDataNotificationJpaRepositoryImpl implements NotificationRepository {

	private final NotificationJpaRepository notificationJpaRepository;

	@Override
	public void save(Notification newNotification) {
		notificationJpaRepository.save(newNotification);
	}

	@Override
	public Notification findById(UUID notificationId) {
		return notificationJpaRepository.findById((notificationId))
			.orElseThrow(() -> new IllegalArgumentException("해당 알림을 찾을 수 없습니다."));
	}

	@Override
	public void deleteById(UUID notificationId) {
		notificationJpaRepository.deleteById((notificationId));
	}
}
