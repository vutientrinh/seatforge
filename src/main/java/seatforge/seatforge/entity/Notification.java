package seatforge.seatforge.entity;


import jakarta.persistence.*;
import lombok.*;
import seatforge.seatforge.enums.ENotificationEvent;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "notification")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Notification {
    @Id
    @Column(name = "id", nullable = false, columnDefinition = "uuid")
    private UUID id;
    @Column(name = "user")
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private User userId;
    private ENotificationEvent event;
    private String content;
    private LocalDateTime createAt;
}
