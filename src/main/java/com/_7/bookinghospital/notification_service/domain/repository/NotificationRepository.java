package com._7.bookinghospital.notification_service.domain.repository;

import com._7.bookinghospital.notification_service.domain.model.Notification;

public interface NotificationRepository {
	void save(Notification newNotification);
}
