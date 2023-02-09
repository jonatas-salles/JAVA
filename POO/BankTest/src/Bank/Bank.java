package Bank;

public class Bank {
    public static final int MAX_ACCOUNTS = 1000000;
    private final Account[] accounts;
    private int numberOfAccounts;
    private int number;

    public Bank(int number) {
        this.number = number;
        accounts = new Account[MAX_ACCOUNTS];
    }

    public void listAccounts() {
        for (int i = 0; i < numberOfAccounts; i++) {
            System.out.println(accounts[i].getAccountAsString());

        }
    }

    public void listAccounts(long agency) {
        for (int i = 0; i < numberOfAccounts; i++) {
            if(accounts[i].getAgency() == agency) {
                System.out.println(accounts[i].getAccountAsString());
            }
        }
    }

    public double approveLimit(double amount, int accountTime) {
        if(amount < 200) return amount;
        if(amount < 200 + (300 * accountTime)) return amount;
        return 200 + (300 * accountTime);
    }

    public void addAccount(Account account) {
        if(account == null) return;
        if(numberOfAccounts == MAX_ACCOUNTS) return;
        accounts[numberOfAccounts++] = account;
    }

    public int getNumber() {
        return number;
    }
}
