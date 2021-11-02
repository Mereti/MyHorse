package dto.GamerStud;

import dto.GamerStud.GamerStudDataDto;
import service.GamerStudService;

public class GamerStudAddResult {
    private GamerStudDataDto gamerStudData;
    private String message;
    private GamerStudService.Add_Status addStatus;
}
