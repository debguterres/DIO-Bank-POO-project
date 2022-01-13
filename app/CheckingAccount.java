package app;

public class CheckingAccount extends Account {

        public CheckingAccount(Client client) {
            super(client);
        }

        @Override
        public void printBankStatement() {
            System.out.print("Extrato Conta Corrente: \n");
            super.printCommonInfo();
        }
}