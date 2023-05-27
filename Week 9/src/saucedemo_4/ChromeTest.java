package saucedemo_4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class ChromeTest {

        static String url = "https://www.saucedemo.com/";
        static String expectedTitle = "Swag Labs"; // expected title
        static WebDriver driver;

    public static void main(String[] args) {


            ChromeOptions options = new ChromeOptions();// setting webdriver
            //options.addArguments("--remote-allow-origins=*");
            driver = new ChromeDriver(options);
            driver.get(url); //launch url
            driver.manage().window().maximize();// maximising screen
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));// giving wait
            String actualTitle=driver.getTitle(); //getting title of page
            System.out.println("The actual title of the page is "+actualTitle);//printing title of page
            driver.quit();//closing driver
        }
    }



