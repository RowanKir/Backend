package ac.za.cput.Domain.Movie;

public class Actor {

    int actorId;
    String actorGender, actorFullName;

    public Actor(Builder builder) {
        this.actorId = builder.actorId;
        this.actorGender = builder.actorGender;
        this.actorFullName = builder.actorFullName;
    }

    public int getActorId() {
        return actorId;
    }

    public String getActorGender() {
        return actorGender;
    }

    public String getActorFullName() {
        return actorFullName;
    }

    public static class Builder
    {
        int actorId;
        String actorGender, actorFullName;

        public Builder actorId(int actorId)
        {
            this.actorId = actorId;
            return this;
        }

        public Builder actorGender(String actorGender)
        {
            this.actorGender = actorGender;
            return this;
        }

        public Actor build()
        {
            return new Actor(this);
        }
    }

    @Override
    public String toString() {
        return "ActorService{" +
                "actorId=" + actorId +
                ", actorGender='" + actorGender + '\'' +
                ", actorFullName='" + actorFullName + '\'' +
                '}';
    }
}
