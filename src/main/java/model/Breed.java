package model;


import dto.horse.HorseBreed;
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
@Table(name = "breed")

public class Breed {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name="breedId", nullable = false, unique=true)
    private Integer breedId;

    @Column(name="horseBreed", nullable = false)
    private HorseBreed horseBreed;

    @Column(name="fast", nullable = false)
    private double fast;

    @Column(name="hungry", nullable = false)
    private Integer hungry;

    @Column(name="thirst", nullable = false)
    private Integer thirst;

    @Column(name="appearance", nullable = false)
    private double appearance;

    @Column(name="value", nullable = false)
    private double value;
}
