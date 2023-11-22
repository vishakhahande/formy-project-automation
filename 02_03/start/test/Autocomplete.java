import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Autocomplete {
    public static void main(String[] args) throws InterruptedException{

        //System.setProperty("webdriver.chrome.driver", "C:\\Vishakha\\Selenium\\Ex_Files_Selenium_EssT\\Exercise Files\\02_03\\start\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", "C:\\Vishakha\\Selenium\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/autocomplete");
        WebElement autocomplete = driver.findElement(By.id("autocomplete"));
        autocomplete.sendKeys("Maimonisdeslaan 48,1186DV,Amstelveen,NL");
        Thread.sleep(1000);

        //WebElement autocompleteResult = driver.findElement(By.className("pac-container hdpi"));
        //autocompleteResult.click();

        driver.quit();
    }
}
