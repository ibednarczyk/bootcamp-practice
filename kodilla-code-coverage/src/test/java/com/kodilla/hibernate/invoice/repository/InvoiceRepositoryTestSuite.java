package com.kodilla.hibernate.invoice.repository;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceRepositoryTestSuite {
    @Autowired
    private InvoiceRepository invoiceRepository;
    @Autowired
    private ProductRepository productRepository;

    @Test
    public void testInvoiceRepositorySave(){
        //given
        Item item = new Item(new BigDecimal(5), 1, new BigDecimal(5), new Product("Milk"));
        Item item2 = new Item(new BigDecimal(8), 2, new BigDecimal(16), new Product("Cream"));
        Item item3 = new Item(new BigDecimal(10), 1, new BigDecimal(10), new Product("Cheese"));

        Product product = new Product("Dairy");
        item.setProduct(product);
        item2.setProduct(product);
        item3.setProduct(product);

        List<Item> itemsList = new ArrayList<>();
        Invoice invoice = new Invoice("1/2020", itemsList);
        itemsList.add(item);
        itemsList.add(item2);
        itemsList.add(item3);

        //when
        productRepository.save(product);
        invoiceRepository.save(invoice);

        int id = invoice.getId();
        //then
        Assert.assertNotEquals(0, id);
        //cleanUp
        try {
            invoiceRepository.deleteById(id);
        } catch (Exception e){
            //do nothing
        }

    }
}
