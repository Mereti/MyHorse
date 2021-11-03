package dto.GamerStud;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class GamerStudDataDto {
    private  Integer id;
    private Integer gamerId;
    private String name;
}
