import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BasicLocator {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Schulung Silenium\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.de");

        //driver.findElement(By.id("APjFqb")).sendKeys("Melanie Loth");
        //driver.findElement(By.name("btnK")).submit();
        //driver.findElement(By.linkText("Gmail")).click();
        //driver.findElement(By.partialLinkText("Über G")).click();

        //driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("Hund");
        //driver.findElement(By.name("btnK")).submit();

        //xpath wenn id mehrfach aufkommt
        //driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("Ridgeback");
        //driver.findElement(By.xpath("//input[@name='btnK']")).submit();

        //über Text Inhalt finden
        //driver.findElement(By.xpath("//a[text()='Über Google']")).click();

        //auf ein Element zugreifen:
        driver.findElement(By.xpath("//a[contains(text(),'Über G')]")).click();

        //Wartezeit:
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


        //Navigieren:
        driver.navigate().back();

        //Aktualisieren der Seite:
        //driver.navigate().refresh();

        //Abrufen des Titels der Website:
        String pageTitle = driver.getTitle();
        System.out.println("Titel der Website: " + pageTitle);



        //URL Ausgabe
        String currentURL = driver.getCurrentUrl();
        System.out.println("URL der Website: " + currentURL);

        //Browser Maximieren, davor muss Wartezeit rein
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //driver.manage().window().maximize();

        //Browser schließen:
        //driver.close();


    }
}
