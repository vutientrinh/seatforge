package seatforge.seatforge.entity;


import jakarta.persistence.*;
import lombok.*;
import seatforge.seatforge.enums.ERole;

import java.util.UUID;

@Entity
@Table(name = "roles")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RoleEntity {
    @Id
    @Column(name = "id", nullable = false,columnDefinition = "uuid")
    private UUID id;
    @Enumerated(EnumType.STRING)
    @Column(length = 20)
    private ERole name;

}
