package seatforge.seatforge.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
    private Event event;
}
