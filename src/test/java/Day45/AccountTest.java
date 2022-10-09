package Day45;

public class AccountTest {
    public static void main(String[] args) {

        Account account = new Account();

        account.setAcc_number(1234567890);
        account.setName("Hasan");
        account.setEmail("hasan@gmail.com");
        account.setAmount(45000.00);
        account.setPhoneNumber("06771652879");
        account.setAddress("10 London Road");
        System.out.println(account.getAcc_number());
        System.out.println(account.toString());
    }
}
