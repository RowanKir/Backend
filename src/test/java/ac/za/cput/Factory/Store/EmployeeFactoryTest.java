package ac.za.cput.Factory.Store;

import ac.za.cput.Domain.Store.Employee;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeFactoryTest {

    @Test
    void buildEmployee() {
        Employee emp1 = EmployeeFactory.buildEmployee("1", "Rowan", "Mr.", "1 Gore");

        assertNotNull(emp1);
        System.out.println(emp1.toString());

    }
}