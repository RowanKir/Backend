package ac.za.cput.Domain.Member;

public class Notification {

    int notificationId;
    String notificationDescription;

    public Notification(Builder builder) {
        this.notificationId = builder.notificationId;
        this.notificationDescription = builder.notificationDescription;
    }

    public int getNotificationId() {
        return notificationId;
    }

    public String getBuildernotificationDescription() {
        return notificationDescription;
    }

    public static class Builder
    {
        int notificationId;
        String notificationDescription;

        public Builder notificationId(int notificationId)
        {
            this.notificationId = notificationId;
            return this;
        }

        public Builder notificationDescription(String notificationDescription)
        {
            this.notificationDescription = notificationDescription;
            return this;
        }

        public Notification build()
        {
            return new Notification(this);
        }
    }


    @Override
    public String toString() {
        return "Notification{" +
                "notificationId=" + notificationId +
                ", notificationDescription='" + notificationDescription + '\'' +
                '}';
    }
}
