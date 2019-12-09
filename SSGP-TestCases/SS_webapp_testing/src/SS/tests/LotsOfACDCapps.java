package SS.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LotsOfACDCapps {
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
  public void testLotsOfACDCapps() throws Exception {
    driver.get("http://ec2-13-59-224-79.us-east-2.compute.amazonaws.com:8080/SS-webproject/HomepageSelection.jsp");
    driver.findElement(By.name("batteryAH")).click();
    driver.findElement(By.name("batteryAH")).clear();
    driver.findElement(By.name("batteryAH")).sendKeys("3000");
    driver.findElement(By.name("batteryDODLimit")).clear();
    driver.findElement(By.name("batteryDODLimit")).sendKeys("0.5");
    driver.findElement(By.name("batteryCurrentDOD")).clear();
    driver.findElement(By.name("batteryCurrentDOD")).sendKeys("0.5");
    driver.findElement(By.name("DAY")).clear();
    driver.findElement(By.name("DAY")).sendKeys("90");
    driver.findElement(By.name("solarWatts")).click();
    driver.findElement(By.name("solarWatts")).clear();
    driver.findElement(By.name("solarWatts")).sendKeys("15");
    driver.findElement(By.name("solarHOU")).clear();
    driver.findElement(By.name("solarHOU")).sendKeys("8");
    driver.findElement(By.xpath("//input[@value='Add addition DC appliance']")).click();
    driver.findElement(By.xpath("(//input[@name='DCWatts'])[2]")).click();
    driver.findElement(By.xpath("(//input[@name='DCWatts'])[2]")).clear();
    driver.findElement(By.xpath("(//input[@name='DCWatts'])[2]")).sendKeys("100");
    driver.findElement(By.xpath("(//input[@name='DCHOU'])[2]")).clear();
    driver.findElement(By.xpath("(//input[@name='DCHOU'])[2]")).sendKeys("3");
    driver.findElement(By.xpath("//input[@value='Add addition DC appliance']")).click();
    driver.findElement(By.xpath("(//input[@name='DCWatts'])[3]")).click();
    driver.findElement(By.xpath("(//input[@name='DCWatts'])[3]")).clear();
    driver.findElement(By.xpath("(//input[@name='DCWatts'])[3]")).sendKeys("120");
    driver.findElement(By.xpath("(//input[@name='DCHOU'])[3]")).click();
    driver.findElement(By.xpath("(//input[@name='DCHOU'])[3]")).clear();
    driver.findElement(By.xpath("(//input[@name='DCHOU'])[3]")).sendKeys("3");
    driver.findElement(By.xpath("//input[@value='Add addition DC appliance']")).click();
    driver.findElement(By.xpath("(//input[@name='DCWatts'])[4]")).click();
    driver.findElement(By.xpath("(//input[@name='DCWatts'])[4]")).clear();
    driver.findElement(By.xpath("(//input[@name='DCWatts'])[4]")).sendKeys("60");
    driver.findElement(By.xpath("(//input[@name='DCHOU'])[4]")).clear();
    driver.findElement(By.xpath("(//input[@name='DCHOU'])[4]")).sendKeys("6");
    driver.findElement(By.xpath("//input[@value='Add addition AC appliance']")).click();
    driver.findElement(By.xpath("(//input[@name='ACWatts'])[2]")).click();
    driver.findElement(By.xpath("(//input[@name='ACWatts'])[2]")).clear();
    driver.findElement(By.xpath("(//input[@name='ACWatts'])[2]")).sendKeys("10");
    driver.findElement(By.xpath("(//input[@name='ACHOU'])[2]")).click();
    driver.findElement(By.xpath("(//input[@name='ACHOU'])[2]")).clear();
    driver.findElement(By.xpath("(//input[@name='ACHOU'])[2]")).sendKeys("24");
    driver.findElement(By.xpath("//input[@value='Add addition AC appliance']")).click();
    driver.findElement(By.xpath("(//input[@name='ACWatts'])[3]")).click();
    driver.findElement(By.xpath("(//input[@name='ACWatts'])[3]")).clear();
    driver.findElement(By.xpath("(//input[@name='ACWatts'])[3]")).sendKeys("100");
    driver.findElement(By.xpath("(//input[@name='ACHOU'])[3]")).click();
    driver.findElement(By.xpath("(//input[@name='ACHOU'])[3]")).clear();
    driver.findElement(By.xpath("(//input[@name='ACHOU'])[3]")).sendKeys("6");
    driver.findElement(By.xpath("//input[@value='Add addition AC appliance']")).click();
    driver.findElement(By.xpath("(//input[@name='ACWatts'])[4]")).click();
    driver.findElement(By.xpath("(//input[@name='ACWatts'])[4]")).clear();
    driver.findElement(By.xpath("(//input[@name='ACWatts'])[4]")).sendKeys("300");
    driver.findElement(By.xpath("(//input[@name='ACHOU'])[4]")).click();
    driver.findElement(By.xpath("(//input[@name='ACHOU'])[4]")).clear();
    driver.findElement(By.xpath("(//input[@name='ACHOU'])[4]")).sendKeys("3");
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
