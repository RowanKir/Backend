package ac.za.cput.Domain.Movie;

import ac.za.cput.Factory.Movie.ActorFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ActorTest {

    Actor actor1 = ActorFactory.getActor(1, "Male", "Lukho");
    Actor actor2 = ActorFactory.getActor(2, "female", "Jelleke");
    Actor actor3 = ActorFactory.getActor(3, "Female", "Vernique");

    @Test
    void getActorId() {
        assertNotNull(actor1.actorId);
        assertNotEquals(actor1.getActorId(), actor2.getActorId());
        assertEquals(actor1.getActorId(), 1);
        System.out.println("1st Actor's ID: " +actor1.getActorId()+ "\n2nd Actor's ID: " +actor2.getActorId());
    }

    @Test
    void getActorGender() {
        assertNotNull(actor1.actorGender);
        assertNotEquals(actor1.getActorGender(),  actor2.getActorGender());
        assertEquals(actor1.getActorGender(), "Male");
        System.out.println("1st Actor's gender: " +actor1.getActorGender());
    }

    @Test
    void getActorFullName() {
        //assertNotNull(actor1.actorFullName);
        assertFalse(actor1.getActorFullName() instanceof String);
        System.out.println("1st Actor's Full name: " +actor1.getActorGender());

    }

    @Test
    void testToString() {
        assertNotNull(actor1.toString());
        assertTrue(actor1.toString() instanceof String);
        System.out.println(actor1.toString());
    }
}