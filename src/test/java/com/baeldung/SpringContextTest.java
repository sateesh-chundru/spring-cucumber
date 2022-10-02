package com.baeldung;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.baeldung.SpringDemoApplication;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringDemoApplication.class)
public class SpringContextTest {
    @Autowired
    WebDriver driver;

    @Test
    public void whenSpringContextIsBootstrapped_thenNoExceptions() {
    }

   @Test
    public void testWEbDriver(){


       //Maximize the browser
       driver.manage().window().maximize();

       //Scroll down the webpage by 5000 pixels
       JavascriptExecutor js = (JavascriptExecutor)driver;
       js.executeScript("scrollBy(0, 5000)");

       // Click on the Search button
     //  driver.findElement(By.linkText("Core Java")).click();
       driver.close();


   }

    @Test
    public void testWEbDriver2(){

        driver.navigate().to("https://www.google.com/");
        //Maximize the browser
        driver.manage().window().maximize();

        //Scroll down the webpage by 5000 pixels
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("scrollBy(0, 5000)");

        driver.close();

        // Click on the Search button
        //  driver.findElement(By.linkText("Core Java")).click();

    }
}
