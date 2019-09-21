package ac.za.cput.Factory.Movie;

import ac.za.cput.Domain.Movie.Actor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ActorFactoryTest {

    @Test
    void getActor() {
        Actor acc1 = ActorFactory.getActor(1, "Male", "Rowan");

        assertNotNull(acc1);
        System.out.println(acc1.toString());

    }
}