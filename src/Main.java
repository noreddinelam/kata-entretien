import java.time.LocalDate;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Account account1 = new Account("Nouredine", "lamamra"); /// tester les fonctionnalitées withdrawal / deposit /
                                                                /// history
        Account account2 = new Account("Billel", "boudjit"); /// tester l'exception
        Random random = new Random();
        /// ces des tests aletoires juste pour voir le fonctionnement.
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0)
                account1.deposit(LocalDate.of(2021, 1, random.nextInt(5) + 1), 100); // faire des dépots les 5 premiers
                                                                                     // jours du mois
            else
                try {
                    account1.withdrawal(LocalDate.of(2021, 1, random.nextInt(10) + 10), 50); // faire des retraits du 10
                                                                                             // au 19
                } catch (NotEnoughMoney e) {
                    System.out.println(e.getMessage());
                }
        }
        account1.printHistory();

        try {
            account2.withdrawal(LocalDate.now(), 100);
        } catch (NotEnoughMoney e) {
            System.out.println(e.getMessage());
        }
    }
}
