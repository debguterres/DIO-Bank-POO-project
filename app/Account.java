package app;
public abstract class Account implements IAccount {

    private static final int DEFAULT_BANKAGENCY = 1;
    private static int SEQUENTIAL = 1;

    
    protected int bankAgency;
    protected int accountNumber;
    protected double accountBalance;
    protected Client client;

    public Account(Client client) {
        this.bankAgency = Account.DEFAULT_BANKAGENCY;
        this.accountNumber = SEQUENTIAL++;
        this.client = client;

    }

    @Override
    public void withdraw(double value) {
        accountBalance -= value;

    }

    @Override
    public void deposit(double value) {
        accountBalance += value;
    }

    @Override
    public void transfer(Account destinyAccount, double value) {
        this.withdraw(value);
        destinyAccount.deposit(value);

    }
    
    public int getBankAngency() {
		return bankAgency;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public double getAccountBalance() {
		return accountBalance;
	}



    protected void printCommonInfo() {
        System.out.print(String.format("  Titular: %s \n", this.client.getName()));
        System.out.print(String.format("  Agencia: %d \n", this.bankAgency));
        System.out.print(String.format("  Conta Numero: %d \n", this.accountNumber));
        System.out.print(String.format("  Saldo: %.2f \n", this.accountBalance));
    }
}
