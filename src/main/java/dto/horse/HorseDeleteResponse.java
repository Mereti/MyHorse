package dto.horse;

import dto.horse.HorseDataDto;
import service.HorseService;

public class HorseDeleteResponse {
    private HorseDataDto horse;
    private String message;
    private HorseService.Delete_Status deleteStatus;
}
