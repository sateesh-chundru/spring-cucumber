package com.baeldung.stepdefinitions;

import com.baeldung.SpringIntegrationTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.hamcrest.Matcher;
import org.hamcrest.MatcherAssert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.springframework.beans.factory.annotation.Autowired;
import static org.hamcrest.MatcherAssert.*;


public class MyStepdefs extends SpringIntegrationTest {

    @Autowired
    private WebDriver driver;
    WebElement searchBox;


    @Given("User opens browser Google Site")
    public void userOpensBrowserWithUrlHttpsWwwGoogleCom() {
        driver.navigate().to("https://www.google.com/");

    }

    @Then("He search for {string}")
    public void heSearchForCanfinHomes(String searchText) {
        WebElement searchBox= driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"));
        searchBox.sendKeys(searchText);
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).click();
    }

    @Then("Search results should cntains the canfin homes site")
    public void searchResultsShouldCntainsTheCanfinHomesSite() {
         String text=driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div/div[1]/a/h3")).getText();
         assertThat("It Should be True","Can Fin Homes Ltd. | Homepage".equals(text));
         driver.close();

    }
}
