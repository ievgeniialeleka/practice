package IoCandDependecies.domain.interfaces;

public interface Phone {
    boolean sendMessage(Person recipient);
    void makeCall(Person subscriber);
    default String sendLowBatteryNotification() {
        return "Battery is low. Charge your phone.";
    }
}
