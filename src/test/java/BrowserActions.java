import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserActions {
    WebDriver driver;   //interface=WebDriver , //driver=variable (method)

    @Test        //This my TC
    public void firstTest() {
        driver = new ChromeDriver(); //open new window chrome to automate
        driver.get("https://www.google.com");
        navigation("https://www.nezamacademy.com");
        //  navigateBack();
        // navigateForward();
        // refresh();
        maximize();
        //minimize();
        //setPosition();
        //setdimension();
        //fullscreen();
        getCurrentURL();
        getTitle();
        getPageSource();
        getًWindowHandle();
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.google.com");
        // close();//close the tab
        quit();
    }


    public void navigation(String url) {
        driver.navigate().to(url);
    }
/*
    public void navigateBack() {
        driver.navigate().back();
    }

    public void navigateForward() {
        driver.navigate().forward();
    }

    public void refresh() {
        driver.navigate().refresh();
    }*/

    public void maximize() {
        driver.manage().window().maximize();
    }

    public void minimize() {
        driver.manage().window().minimize();
    }

    public void setPosition() {
        Point point = new Point(100, 100);
        driver.manage().window().setPosition(point);
    }

    public void setdimension() {    //iphone dimension or ipad=1366,1024
        Dimension dimension = new Dimension(390, 844);
        driver.manage().window().setSize(dimension);
    }

    public void fullscreen() {
        driver.manage().window().fullscreen();
    }

    public void getCurrentURL() {
        String URL = driver.getCurrentUrl();
        System.out.println("The current URL is: " + URL);
    }

    public void getTitle() {
        String title = driver.getTitle();
        System.out.println("The current Page title is: " + title);
    }

    public void getPageSource() {
        String pageSource = driver.getPageSource();
        System.out.println("This is page source : " + pageSource);
    }

    public void getًWindowHandle() {
        String windowHandle = driver.getWindowHandle();
        System.out.println("Window Handle is: " + windowHandle);
    }

    public void close() {
        driver.close();
    }

    public void quit() {
        driver.quit();
    }
}
