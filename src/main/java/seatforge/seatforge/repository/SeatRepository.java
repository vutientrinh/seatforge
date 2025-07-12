package seatforge.seatforge.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import seatforge.seatforge.entity.Seat;

import java.util.UUID;

public interface SeatRepository extends JpaRepository<Seat, UUID> {
}
