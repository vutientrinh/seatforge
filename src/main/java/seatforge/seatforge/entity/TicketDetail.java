package seatforge.seatforge.entity;


import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "ticket_detail")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TicketDetail extends Auditable{
    @Id
    @Column(name = "id", nullable = false, columnDefinition = "uuid")
    private UUID id;
    @Column(name = "ticket")
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Ticket ticketId;
    @Column(name = "seat")
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Seat> seatId;
    private BigDecimal price;
}
