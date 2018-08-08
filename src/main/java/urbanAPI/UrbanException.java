package urbanAPI;

public class UrbanException extends Exception{

    private static final long serialVersionUID = 1L;
    public UrbanException(String error_description) {
        super(error_description);
    }
}
