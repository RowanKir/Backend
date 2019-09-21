package ac.za.cput.Domain.Member;

import ac.za.cput.Factory.Member.MemberFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MemberTest {

    Member mem1 = MemberFactory.getMember("Rowan", "Kirchner", "1", 23);
    Member mem2 = MemberFactory.getMember("Lukho", "Mvumvu", "2", 21);

    @Test
    void getFirstName() {
        assertNotNull(mem1);
        assertNotEquals(mem1.getFirstName(), mem2.getFirstName());
        assertEquals(mem1.getFirstName(), "Rowan");
        System.out.println("Member name is: " +mem1.getFirstName() + "\nMember name is: " +mem2.getFirstName());
    }

    @Test
    void getLastName() {
        assertNotNull(mem1);
        assertNotEquals(mem1.getLastName(), mem2.getLastName());
        assertEquals(mem1.getLastName(), "Kirchner");
        System.out.println("Member name is: " +mem1.getLastName() + "\nMember name is: " +mem2.getLastName());
    }

    @Test
    void getAge() {

    }

    @Test
    void getId() {
    }

    @Test
    void testToString() {
    }
}