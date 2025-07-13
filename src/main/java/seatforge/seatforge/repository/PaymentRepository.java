package seatforge.seatforge.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import seatforge.seatforge.entity.Payment;

import java.util.UUID;

public interface PaymentRepository extends JpaRepository<Payment, UUID> {
}
