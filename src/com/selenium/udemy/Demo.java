package com.selenium.udemy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

    public static void main(String[] args) {
        //create driver object for chrome
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
	    WebDriver obj = new ChromeDriver();
	    obj.get("http://www.google.com");
	    System.out.println(obj.getTitle());
	    obj.quit();
    }
}
