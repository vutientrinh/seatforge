package seatforge.seatforge.entity;

import jakarta.persistence.*;
import lombok.*;
import seatforge.seatforge.enums.EMethod;
import seatforge.seatforge.enums.EStatusPayment;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "payment")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Payment extends Auditable {
    @Id
    @Column(name = "id", nullable = false, columnDefinition = "uuid")
    private UUID id;
    @Column(name = "tickets")
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Ticket> ticketId;
    private EMethod method;
    private EStatusPayment statusPayment;
    private String transactionId;
}
