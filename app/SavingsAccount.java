package app;

public class SavingsAccount extends Account {

    public SavingsAccount(Client client) {
        super(client);
    }

    @Override
    public void printBankStatement() {
        System.out.print("Extrato Conta Poupanca: \n");
        super.printCommonInfo();
    }
}