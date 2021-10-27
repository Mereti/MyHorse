package service;

public class HorseService {

    private final String UPDATED = "State of Horse - UPDATED";
    private final String NOT_UPDATED = "State of Horse - NOT UPDATED";
    private final String DELETE = "Removing the horse correctly";
    private final String NOT_DELETE = "Removing the horse not correctly";

    public enum Update_Status{
        UPDATED,
        NOT_UPDATED
    }

    public enum Delete_Status{
        DELETE,
        NOT_DELETE
    }
}
