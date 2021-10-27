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
@Table(name = "gamer_stud")

public class GamerStud {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name="gamer_id", nullable = false, unique=true)
    private Integer gamerId;

    @Column(name="horse_id", nullable = false, unique=true)
    private Integer horseId;
}
