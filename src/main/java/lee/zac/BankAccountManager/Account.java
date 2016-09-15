package lee.zac.BankAccountManager;

/**
 * Created by zaclee on 9/14/16.
 */
public class Account {

    private static int counter;
    private double accountBalance;
    private double newAccountBalance;
    private int accountNumber;
    public String accountType;

    public Account() {
        accountBalance=0;
        accountNumber=counter;
        counter++;
    }

    public String showAccountBalance(Account acc) {
        String accountBalanceMessage = "The balance on your account " + acc + " is: " + acc.getAccountBalance();
        return accountBalanceMessage;
    }


    public double creditAccount(double num) {
        newAccountBalance = accountBalance + num;
        System.out.println("You credited " + num + " to your account. Your total balance is: " + newAccountBalance);
        return newAccountBalance;
    }

    public double debitAccount(double num) {
        newAccountBalance = accountBalance - num;
        System.out.println("You debited " + num + " to your account. Your total balance is: " + newAccountBalance);
        return newAccountBalance;
    }



    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

}
