import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TagName {
    public void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com");
        driver.findElement(By.linkText("Sortable Data Tables")).click();
        //driver.findElement(By.partialLinkText("Sortable")).click();
        //driver.findElement(By.tagName("button")).click();
        WebElement table = driver.findElement(By.id("table1"));
        List<WebElement> tableRows = table.findElements(By.tagName("tr"));//save all tr in table
        System.out.println(tableRows.size());
        System.out.println(tableRows.get(0).getText());
        System.out.println(tableRows.get(1).getText());
        System.out.println(tableRows.get(2).getText());
        System.out.println(tableRows.get(3).getText());
        System.out.println(tableRows.get(4).getText());
        //  driver.findElement(By.xpath("//tagname[@attribute = 'value']"));
        driver.findElement(By.xpath("//input[@type = 'search']"));//relative xpath (search at any place at POM file(
        //he begins to search for any element that has a tagname input regardless of its location an which has an attribute which
        // is name and its value is `q ))
        driver.findElement(By.xpath("//*[attribute = 'value']"));//you can use * to select any tag
        // absolute xpath:begin from the beginning of my file rom first HTML and so on
        driver.findElement(By.xpath("/html/body/div[1]/[attribute = 'value']"));//you can use * to select any tag

    }
}