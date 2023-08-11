package IoCandDependecies.domain.implementation;

import IoCandDependecies.domain.interfaces.Person;
import IoCandDependecies.domain.interfaces.Phone;
import lombok.Data;

import java.util.List;
import java.util.Objects;
import java.util.logging.Logger;

@Data

public class SmartPhone implements Phone {

    private String brand;
    private List<Person> subscriberList;
    private Logger LOG;

    @Override
    public boolean sendMessage(Person recipient) {
        boolean personExist = !Objects.isNull(recipient) && subscriberList.contains(recipient);
        LOG.info((personExist ? "Message was sent successfully" : "Message was not sent") + "\n\n\n");
        return personExist;
    }

    @Override
    public void makeCall(Person subscriber) {
        boolean personExist = !Objects.isNull(subscriber) && subscriberList.contains(subscriber);
        LOG.info((personExist? "Connection was established" : "Cannot find subscriber") + "\n\n\n");
    }
}
