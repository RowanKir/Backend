package ac.za.cput.Factory.Account;

import ac.za.cput.Domain.Account.Account;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountFactoryTest {

    @Test
    void buildAccount() {
        Account acc1 = AccountFactory.buildAccount("1", "Rowan", "Premium");

        assertNotNull(acc1);
        System.out.println(acc1.toString());
    }
}