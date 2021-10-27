package dto.gamer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class GamerDataDto {
    private Integer id;
    private String nickname;
    private String email;
    private Integer permission;
    private float points;
}
