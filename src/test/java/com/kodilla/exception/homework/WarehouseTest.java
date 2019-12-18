package com.kodilla.exception.homework;

import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.*;

public class WarehouseTest {

    @Test
    public void testOrderExists() throws OrderDoesntExistsException{
        //given
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("2/2019"));
        //when
        Order result = warehouse.getOrder("2/2019");
        //then
        assertEquals(new Order("2/2019"), result);


    }

    @Test (expected = OrderDoesntExistsException.class)
    public void testOrderExists_withException() throws OrderDoesntExistsException{
        //given
        Warehouse warehouse = new Warehouse();
        //when
        Order result = warehouse.getOrder("222/2019");


    }

}