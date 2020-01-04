package com.kodilla.mockito.homework;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class AlertService {

    private Map<String, Set<Subscriber>> subscriberService = new HashMap<>();

    public void addSubscriber(String location, Set<Subscriber> subscribers ){
        subscriberService.put(location, subscribers);
    }

    public void sendAlertFromASpecificLocation(Alert alert, String location) {
        Set<Subscriber> foundSubscribers = subscriberService.get(location);
        if (foundSubscribers != null) {
            foundSubscribers.forEach(subscriber -> subscriber.receive(alert));
        }
    }

    public void sendAlertToUniqueSubscribers(Alert alert){
        Set<Subscriber> uniqueSubscribers = subscriberService.values().stream()
                .flatMap(subscribers -> subscribers.stream())
                .collect(Collectors.toSet());
        uniqueSubscribers.forEach(subscriber -> subscriber.receive(alert));
    }
    public void removeSubscriberFromASpecificLocation(Subscriber subscriber, String location) {
        subscriberService.get(location).remove(subscriber);
    }
    public void removeSubscriber(Subscriber subscriber){
        Collection <Set <Subscriber>> subscribersSets = subscriberService.values();
        for(Set<Subscriber> sub : subscribersSets){
            sub.remove(subscriber);
        }
    }

    public void removeLocation(String location){
        subscriberService.remove(location);

    }

}
