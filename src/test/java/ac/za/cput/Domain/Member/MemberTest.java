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
        assertNotNull(mem1);
        assertNotEquals(mem1.getAge(), mem2.getAge());
        assertEquals(mem1.getAge(), "23");
        System.out.println("Member age is: " +mem1.getAge() + "\nMember age is: " +mem2.getAge());

    }

    @Test
    void getId() {
        assertNotNull(mem1);
        assertNotEquals(mem1.getId(), mem2.getId());
        assertEquals(mem1.getId(), "1");
        System.out.println("Member ID is: " +mem1.getId() + "\nMember ID is: " +mem2.getId());

    }
}