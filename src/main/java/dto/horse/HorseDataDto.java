package dto.horse;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor


public class HorseDataDto {
    private Integer id;
    private String name; // imie konia
    private HorseBreed breed; // rasa konia
    private SexHorse sexHorse;
    private float fast; // szybkość konia
    private float resilience; // wytrzymałość konia
    private float health; // zdrowie konia
    private float hungry; // głód konia
    private float thirst; // pragnienie konia
    private String state; // Stan konia - funkcjonalność pozwalająca na określenie czy koń ma właściciela czy nie
}
