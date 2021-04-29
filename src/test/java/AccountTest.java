import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class AccountTest {

    //계정 생성 확인 테스트
    @Test
    public void 계정생성확인초기금액0인지테스트(){
        Account account = new Account();
        int balance = account.getBalance();
        System.out.println("balance : " + balance);
        assertThat(balance, is(0));
    }

    //계정에 예금후 잔액 확인 테스트
    @Test
    public void 예금후잔액테스트(){
        Account account = new Account();
        account.deposit(1000);
        assertThat(account.getBalance(), is(1000));
    }

    //계정에 출금후 잔액 확인 테스트
    @Test
    public void 출금후잔액테스트(){
        Account account = new Account();
        account.withdraw(500);
        assertThat(account.getBalance(), is(-500));
    }

    //계정에 잔액보다 출금액이 크면 출금되지 않고 잔액이 그대로인지 확인 테스트
    @Test
    public void 잔액보다출금액이클때테스트(){
        Account account = new Account();
        account.deposit(500);
        account.withdraw(700);
        assertThat(account.getBalance(), is(500));
    }
}
