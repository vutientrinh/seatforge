package seatforge.seatforge.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;
import seatforge.seatforge.enums.ETicket;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "ticket")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Ticket {
    @Id
    @Column(name = "id", nullable = false,columnDefinition = "uuid")
    private UUID id;
    private User userId;
    private Event eventId;
    private BigDecimal totalAmount;
    private ETicket status;
    private LocalDateTime createAt;
    private LocalDateTime updateAt;
}
