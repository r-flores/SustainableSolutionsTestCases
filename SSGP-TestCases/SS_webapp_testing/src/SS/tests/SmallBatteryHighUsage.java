package SS.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SmallBatteryHighUsage {
  private WebDriver driver;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\X725\\Downloads\\chromedriver_win32\\chromedriver.exe");
      driver = new ChromeDriver();
      // driver = new FirefoxDriver();
      driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
  }

  @Test
  public void testSmallBatteryHighUsage() throws Exception {
    driver.get("http://ec2-13-59-224-79.us-east-2.compute.amazonaws.com:8080/SS-webproject/HomepageSelection.jsp");
    driver.findElement(By.name("batteryAH")).click();
    driver.findElement(By.name("batteryAH")).clear();
    driver.findElement(By.name("batteryAH")).sendKeys("495");
    driver.findElement(By.name("batteryDODLimit")).clear();
    driver.findElement(By.name("batteryDODLimit")).sendKeys("12");
    driver.findElement(By.name("batteryCurrentDOD")).clear();
    driver.findElement(By.name("batteryCurrentDOD")).sendKeys("4");
    driver.findElement(By.name("DAY")).clear();
    driver.findElement(By.name("DAY")).sendKeys("90");
    driver.findElement(By.name("solarWatts")).clear();
    driver.findElement(By.name("solarWatts")).sendKeys("10");
    driver.findElement(By.name("solarHOU")).clear();
    driver.findElement(By.name("solarHOU")).sendKeys("2");
    driver.findElement(By.xpath("//input[@value='Add addition AC appliance']")).click();
    driver.findElement(By.xpath("(//input[@name='ACWatts'])[2]")).click();
    driver.findElement(By.xpath("(//input[@name='ACWatts'])[2]")).clear();
    driver.findElement(By.xpath("(//input[@name='ACWatts'])[2]")).sendKeys("200");
    driver.findElement(By.xpath("(//input[@name='ACHOU'])[2]")).clear();
    driver.findElement(By.xpath("(//input[@name='ACHOU'])[2]")).sendKeys("9");
    driver.findElement(By.xpath("//input[@value='Submit']")).click();
    Thread.sleep(5000);
    driver.findElement(By.linkText("Return")).click();
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
