package model;

import dto.horse.HorseDataDto;
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
@Table(name = "eventResult")

public class EventResult {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name="eventResultId", nullable = false, unique=true)
    private Integer id;

    @Column(name="horseId", nullable = false)
    private Integer horseId;

    @Column(name="pointsScored", nullable = false)
    private Integer pointsScored;


}
