package seatforge.seatforge.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import seatforge.seatforge.entity.TicketDetail;

import java.util.UUID;

public interface TicketDetailRepository extends JpaRepository<TicketDetail, UUID> {
}
