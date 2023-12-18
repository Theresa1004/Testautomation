import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class Webdriver2 {
    public static void main (String [] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Schulung Silenium\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.de");
    }
}
