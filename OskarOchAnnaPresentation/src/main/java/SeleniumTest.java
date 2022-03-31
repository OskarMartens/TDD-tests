import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class SeleniumTest {

    public static void main(String[] args) throws InterruptedException{

        WebDriverManager.chromedriver().setup();
        WebDriverManager.firefoxdriver().setup();
        WebDriverManager.safaridriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://annagame-frontend.herokuapp.com");

        driver.getTitle();
        driver.getCurrentUrl();

        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());

        WebElement playerName = driver.findElement(By.name("player_name"));
        WebElement endGame = driver.findElement(By.name("formButton"));

        playerName.sendKeys("Oskar");
        endGame.click();
    }

}
