package lee.zac.BankAccountManager;


public class ATM {

    User zac = new User("Zac");
    CheckingAccount checkingAccount = new CheckingAccount();
    SavingsAccount savingsAccount = new SavingsAccount();
    BusinessAccount businessAccount = new BusinessAccount();


    public static void main(String[] args) {

        ATM atm = new ATM();
        System.out.println(atm.checkingAccount.creditAccount(50));
        System.out.println(atm.savingsAccount.creditAccount(100));
        System.out.println(atm.savingsAccount.debitAccount(25));
        System.out.println(atm.businessAccount.getAccountNumber());








    }
}

