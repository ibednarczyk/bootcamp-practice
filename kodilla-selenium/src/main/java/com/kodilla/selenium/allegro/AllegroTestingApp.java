package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllegroTestingApp {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/i.bednarczyk/Dokumenty/Development/Kodilla/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://allegro.pl");
        while (!driver.findElement(By.xpath("//html/body/div[2]/div[9]")).isDisplayed()) {

        }
        driver.findElement(By.xpath("//html/body/div[2]/div[9]/div/div[2]/div/button")).click();

        WebElement categoryDropdown = driver.findElement(By.xpath("/html/body/div[2]/div[3]/header/div/div/div/div/form/div[2]/div/select"));
        Select categorySelect = new Select(categoryDropdown);
        categorySelect.selectByIndex(3);

        WebElement inputField = driver.findElement(By.xpath("//html/body/div[2]/div[3]/header/div/div/div/div/form/input"));
        inputField.sendKeys("mavic mini");

        inputField.sendKeys(Keys.DOWN, Keys.RETURN);
    }
}
