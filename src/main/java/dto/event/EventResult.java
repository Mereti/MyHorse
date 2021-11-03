package dto.event;

import dto.horse.HorseDataDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class EventResult {
    private Integer id;
    private HorseDataDto horseId;
    private Integer pointsScored;
}
