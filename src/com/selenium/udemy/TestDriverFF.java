package com.selenium.udemy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestDriverFF {

    public static void main(String[] args) {
        System.out.println("You are My Lord and My God");
        System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Gecko\\geckodriver.exe");
        WebDriver obj = new FirefoxDriver();
        obj.get("https://portal2.biobase-international.com");
        System.out.println(obj.getTitle());
        System.out.println(obj.getPageSource());
        obj.quit();
    }
}
