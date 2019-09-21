package ac.za.cput.Domain.Account;

import ac.za.cput.Factory.Account.AccountFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    Account acc1 = AccountFactory.buildAccount("1", "Rowan", "Premium");
    Account acc2 = AccountFactory.buildAccount("2", "Lukho", "None");

    @Test
    void getAccountId() {
        assertNotNull(acc1.accountId);
        assertNotEquals(acc1.getAccountId(), acc2.getAccountId());
        assertEquals(acc1.getAccountId(), "1");
        System.out.println("Account ID is: " +acc1.getAccountId() + "\nAccount ID is: " +acc2.getAccountId() + "");
    }

    @Test
    void getAccountName() {
        assertNotNull(acc1.accountName);
        assertNotEquals(acc1.getAccountName(), acc2.getAccountName());
        assertEquals(acc1.getAccountName(), "Rowan");
        assertTrue(acc1.getAccountName() instanceof String);
        System.out.println("Account holder name is: " +acc1.getAccountName());

    }

    @Test
    void getAccountDetails() {
        assertNotNull(acc1.accountDetails);
        assertNotEquals(acc1.getAccountDetails(), acc2.getAccountDetails());
        assertEquals(acc1.getAccountDetails(), "Premium");
        assertTrue(acc1.getAccountDetails() instanceof String);
        System.out.println("Account details are: " +acc1.getAccountDetails());

    }

    @Test
    void testToString() {
        assertNotNull(acc1.toString());
        assertTrue(acc1.toString() instanceof String);
        System.out.println(acc1.toString());
    }
}