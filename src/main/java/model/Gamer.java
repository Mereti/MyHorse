package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "gamer")

public class Gamer {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name="gamerId", nullable = false, unique=true)
    private Integer id;

    @Column(name="password", nullable = false)
    private String password;

    @Column(name="email", nullable = false)
    private String email;

    @Column(name="nickname", nullable = false)
    private String nickname;

    @Column(name="permission", nullable = false)
    private Integer permission;

    @Column(name="points", nullable = false)
    private float points;
}
