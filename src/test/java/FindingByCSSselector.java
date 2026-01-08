import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindingByCSSselector {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.linkText("Form Authentication")).click();
        /*driver.findElement(By.cssSelector("#id"));
        driver.findElement(By.cssSelector(".classname"));
        driver.findElement(By.cssSelector("[attribute=value]"));*/
        driver.findElement(By.cssSelector("input#username")).sendKeys("tomsmith");//  i need to interact with this elements
        driver.findElement(By.cssSelector("input#password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.cssSelector("button.radius")).click();
        driver.findElement(By.linkText("/logout")).click();

        driver.quit();
    }

}
