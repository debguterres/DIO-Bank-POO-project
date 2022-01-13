
public interface IAccount {

    void withdraw(double value);

    void deposit(double value);

    void transfer(Account destinyAccount, double value);

    void printBankStatement();

}
