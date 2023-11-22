import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToAlert {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Vishakha\\Selenium\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/switch-window");

        /*WebElement newTabButton = driver.findElement(By.id("new-tab-button"));
        newTabButton.click();

        String originalHandle = driver.getWindowHandle();

        for( String handle1:driver.getWindowHandles()) {
            driver.switchTo().window(handle1);
        }
        driver.switchTo().window(originalHandle);*/
        WebElement newAlertButton = driver.findElement(By.id("alert-button"));
        newAlertButton.click();

        Alert alert = driver.switchTo().alert();
        alert.accept();

        driver.quit();
    }
}
