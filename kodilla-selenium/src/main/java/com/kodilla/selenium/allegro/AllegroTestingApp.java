package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllegroTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/i.bednarczyk/Dokumenty/Development/Kodilla/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://allegro.pl");
        driver.findElement(By.xpath("//*[@data-box-name=\"allegro.rodoConsentModal\"]/div/div/div/div[2]/button[2]")).click();

        WebElement categoryDropdown = driver.findElement(By.xpath("//*[@class=\"_1h7wt _d25db_1HtwQ\"]/div[2]/div/select"));
        Select categorySelect = new Select(categoryDropdown);
        categorySelect.selectByIndex(3);

        WebElement inputField = driver.findElement(By.xpath("//*[@class=\"_1h7wt _d25db_1HtwQ\"]/input"));
        inputField.sendKeys("mavic mini");

        WebElement searchButton = driver.findElement(By.xpath("//*[@class=\"_1h7wt _d25db_1HtwQ\"]/button"));
        searchButton.submit();


    }
}
