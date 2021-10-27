package model;

import dto.horse.HorseBreed;
import dto.horse.SexHorse;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "horse")

public class Horse {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name="id", nullable = false, unique=true)
    private Integer id;

    @Column(name="name", nullable = false)
    private String name;

    @Column(name="breed", nullable = false)
    private HorseBreed breed;

    @Column(name="sex_horse", nullable = false)
    private SexHorse sexHorse;

    @Column(name="fast", nullable = false)
    private float fast;

    @Column(name="resilience", nullable = false)
    private float resilience;

    @Column(name="health", nullable = false)
    private float health;

    @Column(name="hungry", nullable = false)
    private float hungry;

    @Column(name="thirst", nullable = false)
    private float thirst;

    @Column(name="state", nullable = false)
    private String state;


}
