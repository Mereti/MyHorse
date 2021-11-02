package dto.GamerStud;

import dto.GamerStud.GamerStudDataDto;
import service.GamerStudService;

public class GamerStudDeleteResponse {
    private GamerStudDataDto gamerStudData;
    private String message;
    private GamerStudService.Delete_Status deleteStatus;
}
