package ninja.taskbook.model.entity;

//----------------------------------------------------------------------------------------------------
public class NotificationEntity {

    //----------------------------------------------------------------------------------------------------
    public int notificationId;
    public int notificationOwnerId;
    public int notificationReceiverId;
    public int notificationType;
    public String notificationData;

    //----------------------------------------------------------------------------------------------------
    public NotificationEntity() {

    }

    //----------------------------------------------------------------------------------------------------
    public NotificationEntity(int _notificationId, int _notificationOwnerId, int _notificationReceiverId, int _notificationType, String _notificationData) {
        notificationId = _notificationId;
        notificationOwnerId  = _notificationOwnerId;
        notificationReceiverId = _notificationReceiverId;
        notificationType = _notificationType;
        notificationData = _notificationData;
    }
}
