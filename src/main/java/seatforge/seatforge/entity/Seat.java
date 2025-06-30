package seatforge.seatforge.entity;


import jakarta.persistence.*;
import lombok.*;
import seatforge.seatforge.enums.ESeatStatus;

import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Table(name = "seat")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Seat {
    @Id
    @Column(name = "id", nullable = false,columnDefinition = "uuid")
    private UUID id;
    private String seatNumber;
    private ESeatStatus status;
    private BigDecimal price;
    @Column(name = "event")
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Event event;
}
