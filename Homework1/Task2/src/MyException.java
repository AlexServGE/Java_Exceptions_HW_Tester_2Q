public class MyException extends Exception {
    private String message;

    public MyException(String message, Exception cause) {
        super(message, cause);
    }

    @Override
    public String getMessage() {
        return message;
    }
}
