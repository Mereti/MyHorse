package model;

import dto.event.EventType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "event")

public class Event {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name="eventId", nullable = false, unique=true)
    private String eventId;

    @Column(name="eventId", nullable = false)
    private Integer points;

    @Column(name="eventId", nullable = false)
    private Date lastLogin;

    @Column(name="eventId", nullable = false)
    private Date lastLogout;

    @Column(name="eventId", nullable = false)
    private Integer spendTime;

    @OneToOne(mappedBy = "roleId")
    private Role role;

    @Column(name="loc_x", nullable = false)
    private double loc_x;

    @Column(name="loc_y", nullable = false)
    private double loc_y;

    @Column(name="loc_z", nullable = false)
    private double loc_z;

    @Column(name="email", nullable = false)
    private String email;

    @Column(name="password", nullable = false)
    private String password;
}
