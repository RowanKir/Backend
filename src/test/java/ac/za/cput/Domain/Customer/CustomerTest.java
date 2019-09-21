package ac.za.cput.Domain.Customer;

import ac.za.cput.Factory.Customer.CustomerFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    Customer cust1 = CustomerFactory.buildCustomer("1", "0826130320", "Rowan", "Kirchner");
    Customer cust2 = CustomerFactory.buildCustomer("2", "0842158215", "Lukho", "Mvumvu");

    @Test
    void getCustId() {
        assertNotNull(cust1.custId);
        assertNotEquals(cust1.getCustId(), cust2.getCustId());
        assertEquals(cust1.getCustId(), 1);
        System.out.println("Customer ID is: " +cust1.getCustId() + "\nCustomer ID is: " +cust2.getCustId() + "");
    }

    @Test
    void getCustPhone() {
        assertNotNull(cust1.custPhone);
        assertNotEquals(cust1.getCustPhone(), cust2.getCustPhone());
        assertEquals(cust1.getCustPhone(), "0826130320");
        System.out.println("Customer number is: " +cust1.getCustPhone() + "\nCustomer number is: " +cust2.getCustPhone() + "");
    }

    @Test
    void getCustName() {
        assertNotNull(cust1.custName);
        assertNotEquals(cust1.getCustName(), cust2.getCustName());
        assertEquals(cust1.getCustName(), "Rowan");
        System.out.println("Customer name is: " +cust1.getCustName() + "\nCustomer name is: " +cust2.getCustName() + "");

    }

    @Test
    void getCustSurname() {
        assertNotNull(cust1.custSurname);
        assertNotEquals(cust1.getCustSurname(), cust2.getCustSurname());
        assertEquals(cust1.getCustSurname(), "Kirchner");
        System.out.println("Customer surname is: " +cust1.getCustSurname() + "\nCustomer surname is: " +cust2.getCustSurname() + "");
    }

    @Test
    void testToString() {
        assertNotNull(cust1.toString());
        assertTrue(cust1.toString() instanceof String);
        System.out.println(cust1.toString());
    }
}