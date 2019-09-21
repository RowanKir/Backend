package ac.za.cput.Factory.Movie;

import ac.za.cput.Domain.Movie.Actor;

public class ActorFactory {

    public static Actor getActor(int actorId, String actorGender,String actorFullName)
    {
        return new Actor.Builder()
                .actorGender(actorGender)
                .actorId(actorId)
                .build();
    }
}
