package seatforge.seatforge.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;
import seatforge.seatforge.enums.EMethod;
import seatforge.seatforge.enums.EStatusPayment;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "payment")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Payment {
    @Id
    @Column(name = "id", nullable = false,columnDefinition = "uuid")
    private UUID id;
    private Ticket ticketId;
    private EMethod method;
    private EStatusPayment statusPayment;
    private String transactionId;
    private LocalDateTime createAt;
    private LocalDateTime updateAt;


}
