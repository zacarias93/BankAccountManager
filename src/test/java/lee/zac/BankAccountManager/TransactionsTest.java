package lee.zac.BankAccountManager;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by zaclee on 9/15/16.
 */
public class TransactionsTest {

    Account acc;
    double delta;

    @Before
    public void SetUpTest() {
        acc = new Account();
        double delta = 10^-15;
    }

    @Test
    public void CreditAccountTest() {
        double expected = 100;
        double actual = acc.creditAccount(100);
        Assert.assertEquals(expected,actual,delta);
    }
    @Test
    public void DebitAccountTest() {
        double expected = -100;
        double actual = acc.debitAccount(100);
        Assert.assertEquals(expected,actual,delta);
    }




}
