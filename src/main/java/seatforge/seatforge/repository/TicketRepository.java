package seatforge.seatforge.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import seatforge.seatforge.entity.Ticket;

import java.util.UUID;

public interface TicketRepository extends JpaRepository<Ticket, UUID> {
}
