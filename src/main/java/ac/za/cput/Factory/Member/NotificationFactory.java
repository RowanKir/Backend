package ac.za.cput.Factory.Member;

import ac.za.cput.Domain.Member.Notification;

public class NotificationFactory {

    public static Notification getNotification(int notificationId, String notificationDescription)
    {
        return new Notification.Builder()
                .notificationId(notificationId)
                .notificationDescription(notificationDescription)
                .build();
    }
}
