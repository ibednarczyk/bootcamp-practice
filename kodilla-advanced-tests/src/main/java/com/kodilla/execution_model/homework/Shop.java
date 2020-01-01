package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Shop {

    private Set<Order> orders = new HashSet<>();

    public void addOrder(Order order){
        orders.add(order);
    }

    public List<Order> getOrdersOfTheLastTwoYears(){
        return orders.stream()
                .filter(order -> order.getDate().isAfter(LocalDate.now().minusYears(2)))
                .collect(Collectors.toList());
    }

    public List<Order> getOrdersOfTheValueBetween(double minValue, double maxValue) {
        return orders.stream()
                .filter(order -> order.getValue() >= minValue && order.getValue() <= maxValue)
                .collect(Collectors.toList());
    }


    public int getNumberOfOrders(){
        return orders.size();
    }

    public double getSumOfValue(){
        double sum = 0;
        for (Order order : orders){
            sum+= order.getValue();
        }
        return sum;

    }

    public int getSize(){
        return orders.size();
    }

}
