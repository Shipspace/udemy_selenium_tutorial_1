package com.selenium.udemy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestDriverChrome {
    public static void main (String[]args){
        System.out.println("You are My Lord and My God");
        System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
        WebDriver obj = new ChromeDriver();
        obj.get("https://www.google.com");
        System.out.println(obj.getTitle());
        System.out.println(obj.getPageSource());
        obj.quit();


    }
}

