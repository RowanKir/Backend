package ac.za.cput.Factory.Member;

import ac.za.cput.Domain.Member.Member;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MemberFactoryTest {

    @Test
    void getMember() {

        Member member1 = MemberFactory.getMember("Rowan", "Kirchner", "1", 23);

        assertNotNull(member1);
        System.out.println(member1.toString());
    }
}