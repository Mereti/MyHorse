package dto.gamerResultsStatus;

import dto.gamer.GamerDataDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import service.GamerService;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class GamerBlockResponse {
    private GamerDataDto gamer;
    private String message;
    private GamerService.Block_Status blockStatus;
}
