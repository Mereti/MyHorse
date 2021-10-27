package service;

public class GamerStudService {

    private final String ADDED = "Correctly added";
    private final String NOT_ADDED = "Incorrectly added";
    private final String DELETE = "Removing the horse correctly";
    private final String NOT_DELETE = "removing the horse not correctly";
    private final String DOWNLOADED = "Correctly download";
    private final String NOT_DOWNLOADED = "Incorrect download";

    public enum Add_Status{
        ADDED,
        NOT_ADDED
    }

    public enum Delete_Status{
        DELETE,
        NOT_DELETE
    }

    public enum Get_Status{
        DOWNLOADED,
        NOT_DOWNLOADED
    }
}
