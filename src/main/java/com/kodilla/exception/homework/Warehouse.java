package com.kodilla.exception.homework;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Warehouse {
    private Set<Order> orders;

    public Warehouse() {

        this.orders = new HashSet<>();
    }

    public void addOrder(Order order) {

        orders.add(order);
    }


    public Order getOrder(String number) throws OrderDoesntExistsException {
        return  orders.stream()
                .filter(o -> o.getNumber().equals(number))
                .findAny()
                .orElseThrow(()-> new OrderDoesntExistsException());

    }

    public int getSize(){
        return orders.size();
    }



}









