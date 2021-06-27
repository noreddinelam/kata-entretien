import java.time.LocalDate;

/* Remarque : j'ai rajouté la date comme paramètre pour que vous puissiez spécifier des dates differentes sinon j'aurais pu prendre la date du jour de l'operation et la
mettre directement mais vous ne visualisez pas bien l'éxecution aprés*/

public class Account {
    private double balance;
    private Statement statement;
    private Client client;

    public Account(String firstName, String lastName) {
        this.balance = 0;
        this.statement = new Statement();
        this.client = new Client(firstName, lastName);
    }

    public void deposit(LocalDate date, double amount) {
        this.balance += amount;
        this.statement.addOperationToStatement(new Operation(date, OperationType.Deposit, this.balance, amount));
    }

    public void withdrawal(LocalDate date, double amount) throws NotEnoughMoney {
        if (this.balance - amount < 0)
            throw new NotEnoughMoney();
        else {
            this.balance -= amount;
            this.statement.addOperationToStatement(new Operation(date, OperationType.Withdrawal, this.balance, amount));
        }

    }

    public void printHistory() {
        System.out.println("le relevé de : " + this.client);
        this.statement.printStatement();
    }
}