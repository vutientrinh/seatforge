package seatforge.seatforge.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import seatforge.seatforge.entity.Notification;

import java.util.UUID;

public interface NotificationRepostitory extends JpaRepository<Notification, UUID> {
}
