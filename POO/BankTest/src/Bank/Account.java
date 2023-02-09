package Bank;

public class Account {
    private long number;
    private long agency;
    private double balance;
    private double availableCredit;
    private int password;
    private int accountTime;

    private final Client client;
    private final Bank bank;


    public Account(Client client, Bank bank, long agency, int password, int accountTime) {
        this.number = (long) (Math.random() * (9999 - 1000));
        this.client = client;
        this.bank = bank;
        this.agency = agency;
        this.password = password;
        this.accountTime = accountTime;
        client.addAccount(this);
        bank.addAccount(this);
    }

    public String getAccountAsString() {
        return "\nBank: " + this.bank.getNumber() + " Agency: " + this.agency +
                "\nClient: " + client.getName() +
                "\nAccount: " + this.number +
                "\nBalance: " + this.balance;
    }

    public boolean withdraw(double amount, int password) {
        if(password == this.password) {
            if(amount <= this.balance + availableCredit) {
                if(amount > this.balance) {
                    availableCredit -= (amount - this.balance);
                }
                this.balance -= amount;
                System.out.println("\nWithdraw approved \nNew Balance: " + this.balance);
                return true;
            }
        }
        System.out.println("\nWithdraw Denied!");
        return false;
    }

    public boolean deposit(double amount, int password) {
        if(password == this.password) {
            if(amount > 0) {
                if(this.balance < 0) {
                    this.balance += amount;
                    availableCredit += (amount - this.balance);
                    System.out.println("\nDeposit succeed \nNew Balance: " + this.balance);
                    return true;
                }
                this.balance += amount;
                System.out.println("\nDeposit succeed \nNew Balance: " + this.balance);
                return true;
            }
        }
        System.out.println("\nDeposit Denied!");
        return false;
    }

    public double increaseLimit(double amount, int password) {
        if(password == this.password) {
            availableCredit = bank.approveLimit(amount, this.accountTime);
            System.out.println("Approved");
            return availableCredit;
        }
        System.out.println("\nDenied!");
        return 0;
    }

    public double balance(int password) {
        if(password != this.password) return 0;
        System.out.print("\nAccount: " + this.number + "\nBalance: ");
        return this.balance;
    }

    public long getAgency() {
        return agency;
    }

    public double getAvailableCredit() {
        return availableCredit;
    }
}
