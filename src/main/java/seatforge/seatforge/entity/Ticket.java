package seatforge.seatforge.entity;


import jakarta.persistence.*;
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
    @Column(name = "user")
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private User userId;
    @Column(name = "event")
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Event eventId;
    private BigDecimal totalAmount;
    private ETicket status;
    private LocalDateTime createAt;
    private LocalDateTime updateAt;
}
