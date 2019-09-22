package ac.za.cput.Factory.Customer;

import ac.za.cput.Domain.Customer.Customer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerFactoryTest {

    @Test
    void buildCustomer() {

        Customer cust1 = CustomerFactory.buildCustomer("1", "0826130320", "Rowan", "Kirchner");

        assertNotNull(cust1);
        System.out.println(cust1.toString());
    }
}