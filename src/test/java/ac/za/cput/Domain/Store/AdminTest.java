package ac.za.cput.Domain.Store;

import ac.za.cput.Factory.Store.AdminFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdminTest {

    Admin admin1 = AdminFactory.getAdmin(1, "Rowan", "RowanKir");
    Admin admin2 = AdminFactory.getAdmin(2, "Levi", "LevioSwag");


    @Test
    void getAdminId() {
        assertNotNull(admin1.adminId);
        assertNotEquals(admin1.getAdminId(), admin2.getAdminId());
        assertEquals(admin1.getAdminId(), 1);
        System.out.println("Admin ID is: " +admin1.getAdminId() + "\nAdmin ID is: " +admin1.getAdminId() + "");

    }

    @Test
    void getAdminName() {
        assertNotNull(admin1.getAdminName());
        assertNotEquals(admin1.getAdminName(), admin2.getAdminName());
        assertEquals(admin1.getAdminName(), "Rowan");
        assertTrue(admin1.getAdminName() instanceof String);
        System.out.println("Admin name is: " +admin1.getAdminName());

    }

    @Test
    void getAdminLogin() {
        assertNotNull(admin1.adminLogin);
        assertNotEquals(admin1.getAdminLogin(), admin2.getAdminLogin());
        assertEquals(admin1.getAdminLogin(), "RowanKir");
        assertTrue(admin1.getAdminLogin() instanceof String);
        System.out.println("Admin login is: " +admin1.getAdminLogin());

    }

    @Test
    void testToString() {
        assertNotNull(admin1.toString());
        assertTrue(admin1.toString() instanceof String);
        System.out.println(admin1.toString());

    }
}