package seatforge.seatforge.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Table(name = "ticket_detail")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TicketDetail {
    @Id
    @Column(name = "id", nullable = false,columnDefinition = "uuid")
    private UUID id;

    private Ticket ticketId;
    private Seat seatId;
    private BigDecimal price;
}
