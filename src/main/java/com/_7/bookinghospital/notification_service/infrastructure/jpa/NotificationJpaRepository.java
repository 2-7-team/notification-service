package com._7.bookinghospital.notification_service.infrastructure.jpa;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com._7.bookinghospital.notification_service.domain.model.Notification;

public interface NotificationJpaRepository extends JpaRepository<Notification, UUID> {
}
