package seatforge.seatforge.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "user")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User extends Auditable{
    @Id
    @Column(name = "id", nullable = false, columnDefinition = "uuid")
    private UUID id;
    private String userName;
    private String email;
    private String password;
    @Column(name = "role")
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Role role;
}
