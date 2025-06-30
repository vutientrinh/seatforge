package seatforge.seatforge.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "event")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Event extends Auditable {
    @Id
    @Column(name = "id", nullable = false, columnDefinition = "uuid")
    private UUID id;
    private String title;
    private String description;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private String venue;
    @Column(name = "user")
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private User createdBy;
}
