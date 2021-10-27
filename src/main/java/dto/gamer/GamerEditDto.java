package dto.gamer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

//W zmianie nie uwzględniamy zmiany nickname - ze względów serwerowych - mojang account

public class GamerEditDto {
    private String email;
    private String password;
}
