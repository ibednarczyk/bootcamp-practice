package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ShopTest {

    Shop shop = new Shop();

    @BeforeEach
    public void initializeTest(){
        shop.addOrder(new Order(150.0, LocalDate.of(2019, 12, 1), "tom12"));
        shop.addOrder(new Order(328.9, LocalDate.of(2019,10,3), "user456"));
        shop.addOrder(new Order(250.5, LocalDate.of(2016,6, 13), "lukas94"));
        shop.addOrder(new Order(25.4, LocalDate.of(2014,9, 8), "julia15"));
        shop.addOrder(new Order(1990.5, LocalDate.of(2017,12, 27), "mike77"));
        shop.addOrder(new Order(1990.5, LocalDate.of(2017,12, 27), "mike77"));

    }

    @Test
    public void shouldAddOrderToShop(){
        assertEquals(5, shop.getSize());
    }

    @Test
    public void shouldReturnOrdersOfTheLastTwoYears(){
        //when
        List<Order> resultList = shop.getOrdersOfTheLastTwoYears();
        //then
        assertEquals(2, resultList.size());
    }

    @Test
    public void shouldGetOrdersWithValueBetween(){
        //when
        List<Order> resultList = shop.getOrdersOfTheValueBetween(100.0, 1000.0);
        //then
        assertEquals(3, resultList.size());
    }
    @Test
    public void shouldGetNumbersOfOrders(){
        //when
        int result = shop.getNumberOfOrders();
        //then
        assertEquals(5, result);
    }
    @Test
    public void shouldGetSumOfValues(){
        //when
        double result = shop.getSumOfValue();
        //then
        assertEquals(2745.3, result);
    }



}