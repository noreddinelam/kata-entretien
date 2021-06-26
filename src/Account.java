public class Account {
    private double solde;
    private Statement statement;

    Account() {
        this.solde = 0;
        this.statement = new Statement();
    }
}