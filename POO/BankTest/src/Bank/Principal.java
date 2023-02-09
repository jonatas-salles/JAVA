package Bank;

public class Principal {
    public static void main(String[] args) {
        Bank bank = new Bank(7);
        Bank bank2 = new Bank(5);

        Client jon = new Client("Jon", "123123123-12");
        Account accountJ = new Account(jon, bank, 1501, 123, 2);
        Account accountJ2 = new Account(jon, bank, 1202, 321, 1);
        accountJ2.deposit(3132, 321);

        Client maria = new Client("Maria", "321321321-12");
        Account accountM = new Account(maria, bank, 1501, 222, 0);
        accountM.deposit(6540, 222);

        Client lucas = new Client("Lucas", "111111111-12");
        Account accountL = new Account(lucas, bank2, 1501, 111, 2);
        accountL.deposit(731, 111);

        accountJ.deposit(130, 123);
        accountJ.withdraw(150, 123);
        accountJ.increaseLimit(100, 123);
        accountJ.withdraw(150, 123);
        System.out.println(accountJ.getAvailableCredit());
        System.out.println(accountJ.balance(123));
        accountJ.deposit(130, 123);
        System.out.println(accountJ.getAvailableCredit());

        System.out.println("------------------------------");
        System.out.println("\nClients Accounts");
        jon.listAccounts();
        maria.listAccounts();
        lucas.listAccounts();

        System.out.println("------------------------------");
        System.out.println("\nBank 7 - Accounts");
        bank.listAccounts();
        System.out.println("------------------------------");
        System.out.println("\nBank 5 - Accounts");
        bank2.listAccounts();

        System.out.println("------------------------------");
        System.out.println("\nBank 7 - Agency: 1501 Accounts");
        bank.listAccounts(1501);



    }
}
