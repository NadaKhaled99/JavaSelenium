import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test

public class WebElements {
    WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromiumdriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/login");
        // driver.findElement(By.id("username"));// just find this elements
        //driver.findElement(By.id("username")).sendKeys("tomsmith");//  i need to interact with this elements
        //driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.name("username")).sendKeys("tomsmith");//  i need to interact with this elements
        driver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.className("radius")).click();
        driver.findElement(By.cssSelector(".button.secondary.radius")).click();// compound class : that have classname with space

        Thread.sleep(2000);
        driver.manage().window().maximize();
        quit();
    }

    public void quit() {
        driver.quit();
    }
}



/*public class WebElements {
    WebDriver driver;   //interface=WebDriver , //driver=variable (method)

    @Test        //This my TC
    public void firstTest() {
        driver = new ChromeDriver(); //open new window chrome to automate
        driver.get("https://www.google.com");
        navigation("https://www.nezamacademy.com");
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://the-internet.herokuapp.com/login");
        fullscreen();


        quit();
    }


    public void navigation(String url) {
        driver.navigate().to(url);
    }

    public void fullscreen() {
        driver.manage().window().fullscreen();
    }
   
    public void quit() {
        driver.quit();
    }
}
*/
