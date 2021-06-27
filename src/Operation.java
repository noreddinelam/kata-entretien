import java.time.LocalDate;

public class Operation {
    private LocalDate date;
    private OperationType opType;
    private double balance;
    private double amount;

    Operation(LocalDate date, OperationType opType, double balance, double amount) {
        this.date = date;
        this.opType = opType;
        this.balance = balance;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Date : " + this.date + "\nType D'operation : " + this.opType + "\nBalance : " + this.balance
                + "\nAmount : " + this.amount;
    }

    public LocalDate getDate() {
        return date;
    }
}
