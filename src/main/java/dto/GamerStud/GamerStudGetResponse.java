package dto.GamerStud;

import dto.GamerStud.GamerStudDataDto;
import service.GamerStudService;

public class GamerStudGetResponse {
    private GamerStudDataDto gamerStudData;
    private String message;
    private GamerStudService.Get_Status getStatus;
}
