package Bank;

public class Client {
    public static final int MAX_ACCOUNTS = 10;
    private final String name;
    private final String cpf;

    private final Account[] accounts;
    private int numberOfAccounts;

    public Client(String name, String cpf) {
        this.name = name;
        this.cpf = cpf;
        accounts = new Account[MAX_ACCOUNTS];
    }

    public void listAccounts() {
        for (int i = 0; i < numberOfAccounts; i++) {
            System.out.println(accounts[i].getAccountAsString());
        }
    }

    public void addAccount(Account account) {
        if(account == null) return;
        if(numberOfAccounts == MAX_ACCOUNTS) return;
        accounts[numberOfAccounts++] = account;
    }

    public String getName() {
        return name;
    }
}
