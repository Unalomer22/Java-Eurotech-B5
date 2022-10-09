package Day26_Rewiew;

public class BankOfEngland {
    public static void main(String[] args) {

        BankAccount account1 = new BankAccount();

        account1.accountHolder = " Ahmet Mesut ";
        account1.accountNumber = 123456789l;

        account1.displayBalance();

        account1.deposit(25000);

        account1.displayBalance();

        account1.withdraw(750);

        account1.displayBalance();

        account1.charge("Book",50);
        account1.displayBalance();

        account1.withdraw(24300);// Kalan bakıyeden daha fazla miktarda para cekmek istersek işlem olmuyor.

        account1.displayBalance();

        account1.charge("Car", 50000);
        account1.displayBalance();

    }
}
