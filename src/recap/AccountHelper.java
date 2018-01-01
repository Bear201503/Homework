package recap;

public class AccountHelper {

    public static void main(String[] args) {

        Account account1 = new Account(123, 400, "Esha");
        Account account2 = new Account(456, 300, "Bear");

        account2.changeOwner("Shreya");
        account1.addBalance(500);
        account2.addBalance(400);
        account1.changeAccount(234);
        account2.changeAccount(567);
    }
}
