package dto.horse;

import dto.horse.HorseDataDto;
import service.HorseService;

public class HorseUpdateResponse {
    private HorseDataDto horse;
    private String message;
    private HorseService.Update_Status updateStatus;
}
