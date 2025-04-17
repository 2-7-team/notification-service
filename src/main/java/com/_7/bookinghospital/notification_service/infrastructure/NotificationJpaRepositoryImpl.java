package com._7.bookinghospital.notification_service.infrastructure;

import org.springframework.stereotype.Repository;

import com._7.bookinghospital.notification_service.domain.model.Notification;
import com._7.bookinghospital.notification_service.domain.repository.NotificationRepository;
import com._7.bookinghospital.notification_service.infrastructure.jpa.NotificationJpaRepository;

@Repository
public class NotificationJpaRepositoryImpl implements NotificationRepository {

	NotificationJpaRepository notificationJpaRepository;

	@Override
	public void save(Notification newNotification) {
		notificationJpaRepository.save(newNotification);
	}
}
