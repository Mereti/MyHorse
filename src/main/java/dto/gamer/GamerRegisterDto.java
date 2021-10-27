package dto.gamer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class GamerRegisterDto {
    private String email;
    private String password;
    private String nickname;
}
