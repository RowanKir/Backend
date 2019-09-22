package ac.za.cput.Factory.Store;

import ac.za.cput.Domain.Store.Admin;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdminFactoryTest {

    @Test
    void getAdmin() {
        Admin admin1 = AdminFactory.getAdmin(1,"Rowan", "RowanKir");

        assertNotNull(admin1);
        System.out.println(admin1.toString());
    }
}