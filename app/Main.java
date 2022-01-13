package app;
public class Main {

    public static void main(String[] args) {
        Client client1 = new Client();
        client1.setName("Paçoquita");

        Account ca = new CheckingAccount(client1);
        Account sa = new SavingsAccount(client1); 

        ca.deposit(150);
        ca.transfer(sa, 50);
        sa.withdraw(10);

        ca.printBankStatement();
        sa.printBankStatement();
    }

}
