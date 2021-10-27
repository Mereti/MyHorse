package service;

public class GamerService {

    private final String BLOCKED = "Player blocked";
    private final String UNBLOCKED = "player unblocked";
    private final String DELETE = "";
    private final String NOT_DELETE = "";
    private final String EDITED = "";
    private final String NOT_EDITED = "";
    private final String LOGIN = "";
    private final String NOT_LOGGED = "";
    private final String REGISTERED = "";
    private final String NOT_REGISTERED = "";

    public enum Block_Status{
        BLOCKED,
        UNBLOCKED
    }

    public enum Delete_Status{
        DELETE,
        NOT_DELETE
    }

    public enum Edit_Status{
        EDITED,
        NOT_EDITED
    }

    public enum Login_Status{
        LOGIN,
        NOT_LOGGED
    }

    public enum Register_Response{
        REGISTERED,
        NOT_REGISTERED
    }

}
