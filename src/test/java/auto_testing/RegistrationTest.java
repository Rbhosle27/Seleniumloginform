package auto_testing;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegistrationTest {
	private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        System.out.println("Setting up WebDriver...");
        System.setProperty("webdriver.chrome.driver", "C:\\msedgedriver.exe");
        driver = new EdgeDriver();
        driver.get("http://localhost/registrationFrom/index.php");
        System.out.println("WebDriver initialized: " + driver);
    }

    @Test
    public void successfulRegistration() throws InterruptedException {
        if (driver == null) {
            System.out.println("Driver is null in the test method!");
            return;
        }
        Thread.sleep(6000);
        driver.findElement(By.id("username")).sendKeys("Rajesh");
        Thread.sleep(4000);
        driver.findElement(By.id("password")).sendKeys("Rajesh@8009");
        driver.findElement(By.id("mobile")).sendKeys("9993236548");
        Thread.sleep(4000);
        driver.findElement(By.id("df")).click();
        Thread.sleep(2000);

     }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();  
        }
    }
}

