package ac.za.cput.Domain.Movie;

import ac.za.cput.Factory.Movie.ActorFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ActorTest {

    Actor actor1 = ActorFactory.getActor(1, "Male", "Rowan");
    @Test
    void getActorId() {
    }

    @Test
    void getActorGender() {
    }

    @Test
    void getActorFullName() {
    }

    @Test
    void testToString() {
    }
}