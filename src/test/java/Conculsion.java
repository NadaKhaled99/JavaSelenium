//Notes:
/*
1) we use pom file to add selenium dependency to mange our testcases,
run them in specific order, create test execution schedule ,create  dependencies and priorities
and this is called TestNG/junit
2) selenium is just interacts with web browser and not for test automation only other tasks
in test automation  is done by  another tools that are part of selenium ecosystem
like
3)Navigate Methods: //Webdriver driver
    a-To--> another URL
    driver.navigate().to(url);
    b-Back--> return to the another url
    driver.navigate().back();
    C-Forward--> go to the another url
    driver.navigate().forward();
    d- refresh--> the page
    driver.navigate().refresh();
4)Mange Methods: //have a lot of methods but we will focus on window
    a-maximize--> the page but not full
    driver.manage().window().maximize();
    b-minimize--> the page
    driver.manage().window().minimize();
    c-setPosition--> provide an object of class point that include my position on the screen
    first create object of this class :Point point = new Point(100, 100);
    driver.manage().window().setPosition(point);
    d-setDimension-->for every device , it must have its standard dimensions(how the website looks on the specific screen)
    it is uses to test ho wit will look on iphone screen for example
    driver.manage().window().setSize(dimension=new Dimension(390, 844));
    e-fullscreen--> make the page full screen
    driver.manage().window().fullscreen();
4)get Methods: //get a lot of information
    a-getCurrentURL-->what if i need to know what is the url of the page that i am at now and print it to see the URL name
    String URL = driver.getCurrentUrl();
    b-getTitle-->what if i need to know what is the title of the page that i am at now and print it to see the title name
    String title = driver.getTitle();
    c-getPageSource--> what if i need to save code source of the page that i am at now and print it to see the code
    String pageSource = driver.getPageSource();
    d-getًWindowHandle--> a unique ID for each tab in your browser , help to close the unique id for specific window if we have 10 windows
    String windowHandle = driver.getWindowHandle();
    e-Window tab-->(switch between windowHandle)tell my browser to open a new tab and switch to another tab
    driver.switchTo().newWindow(WindowType.TAB);
    f-getًWindowHandles-->it give me all the set of strings of the tabs
    String windowHandles = driver.getWindowHandles();
5)close/quit Methods:
    a-close--> close one tab
    driver.close();
    b-quit--> close all the tabs and the browser
    driver.quit();
6)HTML and CSS and JavaScript:
    a-HTML--> structure
    HTML = What is on the page
           Defines the content & structure
           Uses tags
           Static by itself
           <h1>Login Page</h1>
           <input type="text" placeholder="Username">
           <button>Login</button>
    b-CSS-->style and layout
    CSS = How it looks
          Controls colors, fonts, layout, spacing
          Makes pages responsive & attractive
          Cannot change logic or behavior
          button {
                  background-color: blue;
                  color: white;
                  padding: 10px;
                  }
    c-Javascript-->behavior and logic--> mind
                 JavaScript = How it behaves
                 Adds interactivity
                 Handles events (clicks, typing)
                 Can change HTML & CSS dynamically
                 Talks to servers (APIs)
                 document.querySelector("button").onclick = function () {
                    alert("Login clicked!");
                 };
7) WebElements : any individual item exited in web page is called element and every eleemnt
has its properties
8) Locators
    a-ID Locator --> value like username
    driver.findElement(By.id("username"));// just find this elements
    b-Name Locator --> value like username
    driver.findElement(By.name("username"));// just find this elements
    c-Class Name -->used it driver to find element by clause (why we don't use the username and password in class locator ?)
    as both of them are inside same class name so each of them not have a unique class
    driver.findElement(By.className("radius")).click();
    d-compound classes-->classes that have spaces between the words
    driver.findElement(By.cssSelector(".button.secondary.radius")).click();
    e-TagName Locator --> if we have more than one element inside this class
    in this website, we don't have more than one element with the same tag
    driver.findElement(By.tagName("button")).click();
    what if we have more than one item with same tag
    (webelement (datatype created by seleinim) not string  to save all the  data of the table that returned from your driver )WebElement table = driver.findElement(By.id("table1"));//select this table
    List<WebElement> tableRows = table.findElements(By.tagName("tr"));//save all tr in table
    list is a java class
    System.out.println(tableRows.size());
    System.out.println(tableRows.get(0).getText());
    f-LinkText Locator --> if we have a link and this link have a text , we can search for this text
    driver.findElement(By.linkText("Sortable Data Tables")).click();
    g-Partial link text--> if the text of the link is too long, we just need to write part of it
    driver.findElement(By.partialLinkText("Sortable")).click();
    f-Xpath--> any element inside your webpage has an XPath
    driver.findElement(By.xpath("//tagname[@attribute = 'value']"));
    driver.findElement(By.xpath("//*[attribute = 'value']"));//you can use * to select any tag
        a-relative--> relative xpath (search at any place at POM file(
        //he begins to search for any element that has a tagname input regardless of its location an which has an attribute which
        // is name and its value is q ))
    driver.findElement(By.xpath("//input[@type = 'search']"));
        b-absolute--> begin from the beginning of my file rom first HTML and so on
    driver.findElement(By.xpath("/html/body/div[1]/[attribute = 'value']"));
    i-cssSelector
    j-ChroPath
9) Thread.sleep(miles: 2000) --> it give a duration to wait
 */