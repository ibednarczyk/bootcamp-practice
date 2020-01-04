package com.kodilla.mockito.homework;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.HashSet;
import java.util.Set;

class AlertServiceTest {

    private AlertService alertService = new AlertService();
    private Subscriber subscriberMock = Mockito.mock(Subscriber.class);
    private Alert alert = Mockito.mock(Alert.class);
    private String location = "Warszawa";
    private Set<Subscriber> subscriberSet = new HashSet<>();

    @Test
    public void subscriberShouldReceiveAnAlertFromASpecificLocation() {
        subscriberSet.add(subscriberMock);
        alertService.addSubscriber(location, subscriberSet);
        alertService.sendAlertFromASpecificLocation(alert, location);
        Mockito.verify(subscriberMock, Mockito.times(1)).receive(alert);
    }

    @Test
    public void subscriberShouldReceiveAnAlertOnlyFromASpecificLocation() {
        String secondLocation = "Poznań";
        subscriberSet.add(subscriberMock);
        alertService.addSubscriber(location, subscriberSet);
        alertService.addSubscriber(secondLocation, subscriberSet);
        alertService.sendAlertFromASpecificLocation(alert, location);
        Mockito.verify(subscriberMock, Mockito.times(1)).receive(alert);
    }

    @Test
    public void shouldNotSendAnAlertWhenALocationHasNoSubscribers() {
        String secondLocation = "Poznań";
        subscriberSet.add(subscriberMock);
        alertService.addSubscriber(location, subscriberSet);
        alertService.sendAlertFromASpecificLocation(alert, location);
        alertService.sendAlertFromASpecificLocation(alert, secondLocation);
        Mockito.verify(subscriberMock, Mockito.times(1)).receive(alert);
    }

    @Test
    public void nonSubscriberShouldNotReceiveAnyAlerts(){
        subscriberSet.add(subscriberMock);
        alertService.sendAlertToUniqueSubscribers(alert);
        alertService.sendAlertFromASpecificLocation(alert, location);
        Mockito.verify(subscriberMock, Mockito.never()).receive(alert);

    }
    @Test
    public void shouldNotSendAnAlertWhenThereAreNoSubscribers(){
        alertService.sendAlertToUniqueSubscribers(alert);
        alertService.sendAlertFromASpecificLocation(alert, location);
        Mockito.verify(subscriberMock, Mockito.never()).receive(alert);

    }

    @Test
    public void multipleSubscriberShouldReceiveOnlyOneAlert(){
        Subscriber secondSubscriberMock = Mockito.mock(Subscriber.class);
        Subscriber thirdSubscriberMock = Mockito.mock(Subscriber.class);
        subscriberSet.add(subscriberMock);
        subscriberSet.add(secondSubscriberMock);
        subscriberSet.add(thirdSubscriberMock);
        alertService.addSubscriber(location, subscriberSet);
        alertService.sendAlertToUniqueSubscribers(alert);
        Mockito.verify(subscriberMock, Mockito.times(1)).receive(alert);
    }

    @Test
    public void removedSubscriberFromASpecificLocationShouldNotReceiveAnAlertFromThisLocation(){
        String secondLocation = "Poznań";
        subscriberSet.add(subscriberMock);
        alertService.addSubscriber(location, subscriberSet);
        alertService.addSubscriber(secondLocation, subscriberSet);
        alertService.sendAlertFromASpecificLocation(alert, location);
        alertService.removeSubscriberFromASpecificLocation(subscriberMock, secondLocation);
        alertService.sendAlertFromASpecificLocation(alert, secondLocation);
        Mockito.verify(subscriberMock, Mockito.times(1)).receive(alert);
    }

    @Test
    public void removedSubscriberShouldNotReceiveAnyAlerts(){
        String secondLocation = "Poznań";
        subscriberSet.add(subscriberMock);
        alertService.addSubscriber(location, subscriberSet);
        alertService.addSubscriber(secondLocation, subscriberSet);
        alertService.removeSubscriber(subscriberMock);
        alertService.sendAlertFromASpecificLocation(alert, location);
        alertService.sendAlertFromASpecificLocation(alert, secondLocation);
        alertService.sendAlertToUniqueSubscribers(alert);
        Mockito.verify(subscriberMock, Mockito.never()).receive(alert);

    }
    @Test
    public void shouldNotSendAnAlertFromRemovedLocation() {
        String secondLocation = "Poznań";
        subscriberSet.add(subscriberMock);
        alertService.addSubscriber(location, subscriberSet);
        alertService.addSubscriber(secondLocation, subscriberSet);
        alertService.removeLocation(location);
        alertService.sendAlertFromASpecificLocation(alert, location);
        alertService.sendAlertFromASpecificLocation(alert, secondLocation);
        Mockito.verify(subscriberMock, Mockito.times(1)).receive(alert);

    }

    @Test
    public void shouldNotSendAnAlertFromALocationWhichDoesNotExist() {
        subscriberSet.add(subscriberMock);
        alertService.addSubscriber(location, subscriberSet);
        alertService.sendAlertFromASpecificLocation(alert, "Gdańsk");
        Mockito.verify(subscriberMock, Mockito.never()).receive(alert);

    }

    @Test
    public void shouldNotRemoveNonExistentLocation() {
        subscriberSet.add(subscriberMock);
        alertService.addSubscriber(location, subscriberSet);
        alertService.removeLocation("Kraków");
        alertService.sendAlertFromASpecificLocation(alert, location);
        Mockito.verify(subscriberMock, Mockito.times(1)).receive(alert);

    }




}