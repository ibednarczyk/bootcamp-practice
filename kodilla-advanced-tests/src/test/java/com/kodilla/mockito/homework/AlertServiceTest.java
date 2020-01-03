package com.kodilla.mockito.homework;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import java.util.HashSet;
import java.util.Set;

class AlertServiceTest {

    private AlertService alertService = new AlertService();
    private Subscriber subscriberMock = Mockito.mock(Subscriber.class);
    private Alert alert = Mockito.mock(Alert.class);
    private String location;
    private Set<Subscriber> subscriberSet = new HashSet<>();

    @Test
    public void subscriberShouldReceiveAlertFromASpecificLocation(){
        Subscriber firstSubscriber = new Subscriber();
        subscriberSet.add(firstSubscriber);
        alertService.addSubscriber(location, subscriberSet);
        alertService.sendAlertFromASpecificLocation(location,alert);
        subscriberMock.receive(alert);
        Mockito.verify(subscriberMock, Mockito.times(1)).receive(alert);
    }
    @Test
    public void nonSubscriberShouldNotReceiveAnyAlerts(){
        alertService.sendAlertToUniqueSubscribers(alert);
        Mockito.verify(subscriberMock, Mockito.never()).receive(alert);

    }
    @Test
    public void shouldSendOnlyOneNotificationToMultipleSubscriber(){
        Subscriber firstSubscriber = new Subscriber();
        subscriberSet.add(firstSubscriber);
        subscriberSet.add(firstSubscriber);
        subscriberSet.add(firstSubscriber);
        subscriberSet.add(firstSubscriber);
        alertService.addSubscriber(location, subscriberSet);
        alertService.sendAlertToUniqueSubscribers(alert);
        subscriberMock.receive(alert);
        Mockito.verify(subscriberMock, Mockito.times(1)).receive(alert);
    }

    @Test
    public void removedSubscriberFromASpecificLocationShouldNotReceiveAlerts(){
        String firstLocation = "Warszawa";
        String secondLocation = "Poznań";
        Subscriber firstSubscriber = new Subscriber();
        subscriberSet.add(firstSubscriber);
        alertService.addSubscriber(firstLocation, subscriberSet);
        alertService.addSubscriber(secondLocation, subscriberSet);
        alertService.removeSubscriberFromASpecificLocation(firstSubscriber, firstLocation);
        alertService.sendAlertFromASpecificLocation(firstLocation, alert);
        alertService.sendAlertFromASpecificLocation(secondLocation, alert);
        subscriberMock.receive(alert);
        Mockito.verify(subscriberMock, Mockito.times(1)).receive(alert);
    }

    @Test
    public void removedSubscriberShouldNotReceiveAnyAlerts(){
        Subscriber firstSubscriber = new Subscriber();
        subscriberSet.add(firstSubscriber);
        alertService.addSubscriber(location, subscriberSet);
        alertService.removeSubscriber(subscriberMock);
        alertService.sendAlertFromASpecificLocation(location, alert);
        alertService.sendAlertToUniqueSubscribers(alert);
        Mockito.verify(subscriberMock, Mockito.never()).receive(alert);

    }
    @Test
    public void shouldNotSendAlertFromRemovedLocation(){
        String firstLocation = "Warszawa";
        Subscriber firstSubscriber = new Subscriber();
        subscriberSet.add(firstSubscriber);
        alertService.addSubscriber(firstLocation, subscriberSet);
        alertService.removeLocation(firstLocation);
        alertService.sendAlertToUniqueSubscribers(alert);
        Mockito.verify(subscriberMock, Mockito.never()).receive(alert);

    }

}