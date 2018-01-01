package recap;

public class Account {

    private int accountNumber;
    private int balance;
    private String owner;

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber() {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance() {
        this.balance = balance;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner() {
        this.owner = owner;
    }

    public void addBalance(int bal) {
        balance = bal;

        while (bal < 0) {
            System.out.println("Value invalid, enter a positive value");

        }
    }

    public void changeAccount(int acc) {
        accountNumber = acc;
    }
    public void withDraw(int with){
        balance = balance-with;

        while(with<0){
            System.out.println("invalid value,enter a positive value");
        }
        while(with>balance){
            System.out.println("invalid value, enter a value less than the amount you have");
        }
    }
}
