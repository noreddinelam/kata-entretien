public class NotEnoughMoney extends Exception {
    private final String message = "Not Enough Money";

    @Override
    public String getMessage() {
        return message;
    }
}