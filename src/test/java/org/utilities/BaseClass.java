package org.utilities;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass  {
	
	public static WebDriver driver;
	public static Actions a;
	public static Robot r;
	public static Alert al;
	public static JavascriptExecutor js;
	
	//1 launch browser - chrome
	public static void launchChrome() {
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
	}
	
	//2 launch browser - edge
	public static void launchEdge() {
    WebDriverManager.edgedriver().setup();
    driver = new EdgeDriver();
	}
	
	//3 launch browser - firefox
	public static void launchFirefox() {
    WebDriverManager.firefoxdriver().setup();
    driver = new FirefoxDriver();
	}
	
	//4 launch browser - ie
	public static void launchIe() {
    WebDriverManager.iedriver().setup();
    driver = new InternetExplorerDriver();
	}
	
    //5 get
	public static void loadUrl(String url) {
    driver.get(url);
	}
	
	//6 max
	public static void maxi() {
    driver.manage().window().maximize();
	}
     
	//7 get title
	public static void printTitle() {
    String title = driver.getTitle();
    System.out.println(title);

	}

	//8 close
	public static void closem() {
	driver.close();
	}
		
    //9 quit
	public static void quitm() {
	driver.quit();
	}
		
	//10 get current 
	public static void printCurrentUrl() {
    String curl = driver.getCurrentUrl();
    System.out.println(curl);
	}
	
	//11 send  keys
	public static void fill(WebElement ele, String value) {
	ele.sendKeys(value);
	}
	
	//12 click
	public static void clickBtn(WebElement ele) {
    ele.click();
	}
	
	//13 gettext
	public static void printText(WebElement ele) {
	String v1 = ele.getText();
	System.out.println(v1);
	}
	
	//14 getattribute
	public static void printUserInput(WebElement ele, String prntvalue) {
	String v2 = ele.getAttribute(prntvalue);
	System.out.println(v2);
	}
	
    //ACTIONS
	//15 double click
	public static void clickTwice(WebElement ele) {
	a = new Actions(driver);
	a.doubleClick(ele).perform();
	}
	
	//16 contextclick
	public static void rightClick(WebElement ele) {
    a= new Actions(driver);
    a.contextClick(ele).perform();
	}
	
	//17 move to element
    public static void moveele(WebElement ele) {
    a=new Actions(driver);
	a.moveToElement(ele).perform();
	
    }
    
    //18 key up - shift
    public static void upSkey() {
    a = new Actions(driver);
    a.keyUp(Keys.SHIFT).perform();
	}
    
    //19 key down -shift
    public static void downSKey() {
    a = new Actions(driver);
    a.keyDown(Keys.SHIFT).perform();
	}
    
    //20 key up - enter
    public static void upEKey() {
    a= new Actions(driver);
    a.keyUp(Keys.ENTER).perform();
	}
    
    //key down - enter
    public static void downEKey() {
	a=new Actions (driver);
	a.keyDown(Keys.ENTER).perform();
    }
    
    //key up
    public static void upDAkey() {
    a = new Actions(driver);
    a.keyUp(Keys.ARROW_DOWN).perform();
	}
    //key down
    public static void downDAkey() {
    a = new Actions(driver);
    a.keyDown(Keys.ARROW_DOWN).perform();
	}
    //key up
    public static void upUAkey() {
    	a = new Actions(driver);
        a.keyUp(Keys.ARROW_UP).perform();

	}
    //key down
    public static void downUAkey() {
    	a = new Actions(driver);
    	a.keyDown(Keys.ARROW_UP).perform();
    }
    //key up
    public static void upLAkey() {
    	a = new Actions(driver);
        a.keyUp(Keys.ARROW_LEFT).perform();

    }
    //key down
    public static void downLAkey() {
    	a = new Actions(driver);
    	a.keyDown(Keys.ARROW_LEFT).perform();
    }
    //key up
    public static void upRAkey() {
    	a = new Actions(driver);
        a.keyUp(Keys.ARROW_RIGHT).perform();

    }
    //key down
    public static void downRAkey() {
    	a = new Actions(driver);
    	a.keyDown(Keys.ARROW_RIGHT).perform();
    }
    
    //20 drag and drop
    public static void dragDrop(WebElement src, WebElement des) {
    a = new Actions(driver);
    a.dragAndDrop(src, des).perform();
	}
    
	//ROBOT
	//21 key press - enter
	public static void pressEKey() throws AWTException {
    r=new Robot();
    r.keyPress(KeyEvent.VK_ENTER);
	}
	
    //22 key release - enter
    public static void releaseEKey() throws AWTException {
    r=new Robot();
    r.keyRelease(KeyEvent.VK_ENTER);
    }
    
  //21 key press - shift
    public static void pressSKey() throws AWTException {
    r=new Robot();
    r.keyPress(KeyEvent.VK_SHIFT);
	}
    
  //21 key release - shift
    public static void releaseSKey() throws AWTException {
    r=new Robot();
    r.keyRelease(KeyEvent.VK_SHIFT);
	}
    
 //refresh page
    //key press f5
    public static void pressF5Key() throws AWTException {
    r= new Robot();
    r.keyPress(KeyEvent.VK_F5);
	}
    //key release f5
    public static void releaseF5Key() throws AWTException {
    r= new Robot();
    r.keyRelease(KeyEvent.VK_F5);
	}
    //ALERT
    //23 accept
    public static void acceptAlert() {
    al = driver.switchTo().alert();
    al.accept();
	}
   
    //24 dismiss
    public static void dismissAlert() {
    al = driver.switchTo().alert();
    al.dismiss();
	}
    
    //25 sendkeys
    public static void alertSendkeys(String val) {
    	al = driver.switchTo().alert();
    	al.sendKeys(val);
	}

    //26 getText
    public static void alertGettxt() {
    al = driver.switchTo().alert();
    String text = al.getText();
    System.out.println(text);
	}
    
    //javascript Executor
    
    public static void script(String cmd , WebElement ele) {
    js=(JavascriptExecutor)driver;
    js.executeScript(cmd, ele);
	}
    
    //to scrollup page
    public static void scrollUp(WebElement pageUp) {
    js=(JavascriptExecutor)driver;
    js.executeScript("arguments[0].scrollIntoView(false)", pageUp);
	}
    
    //to scrolldown page
    public static void scrollDown(WebElement pageDown) {
    js = (JavascriptExecutor)driver;
    js.executeScript("arguments[0].scrollIntoView(true)", pageDown);

	}
    
    //date and time 
    public void dnt() {
    	Date date = new Date();
    	System.out.println(date);
	} 
    
   
	}
