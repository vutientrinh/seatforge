package seatforge.seatforge.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;
import seatforge.seatforge.enums.ENotificationEvent;

import java.time.LocalDateTime;
import java.util.UUID;
K
@Entity
@Table(name = "notification")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Notification {
    @Id
    @Column(name = "id", nullable = false,columnDefinition = "uuid")
    private UUID id;
    private User userId;
    private ENotificationEvent event;
    private String content;
    private LocalDateTime createAt;
}
