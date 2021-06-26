import java.util.Date;

public class Operation {
    private Date date;
    private OperationType opType;
    private double balance;
    private double amount;

    Operation(Date date, OperationType opType, double balance, double amount) {
    }

    public Date getDate() {
        return date;
    }
}
