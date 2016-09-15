package lee.zac.BankAccountManager;

/**
 * Created by zaclee on 9/15/16.
 */
public class User {

    private String name;
    Account account = new Account();

    public User(String name)  {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        CheckingAccount checking = new CheckingAccount();
        SavingsAccount savings = new SavingsAccount();
        BusinessAccount business = new BusinessAccount();
        System.out.println(checking.accountType);
        System.out.println(savings.accountType);
        System.out.println(business.accountType);
    }
}
