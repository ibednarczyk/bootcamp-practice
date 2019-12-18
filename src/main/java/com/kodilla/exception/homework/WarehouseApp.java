package com.kodilla.exception.homework;
public class WarehouseApp {
    public static void main(String[] args) throws OrderDoesntExistsException {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("1/2019"));
        warehouse.addOrder(new Order("2/2019"));
        warehouse.addOrder(new Order("3/2019"));
        warehouse.addOrder(new Order("4/2019"));

        try {
            warehouse.getOrder("5/2019");
        } catch (OrderDoesntExistsException e) {
            System.out.println("Sorry, we can't find your order");
        } finally {
            System.out.println("Thank you for using our services");
        }

        System.out.println(warehouse.getSize());







    }
}
