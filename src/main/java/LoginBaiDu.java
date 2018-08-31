import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.File;

public class LoginBaiDu {


  public static void main(String[] args) throws InterruptedException {

    WebDriver driver = BrowserType.openChrome();
    String baseurl;

    baseurl="http://www.baidu.com/";

    //屏幕最大化
    driver.manage().window().maximize();
    //将浏览器的大小自定义为600*400
    //driver.manage().window().setSize(new Dimension(600, 400));
    //打开百度首页
    driver.get(baseurl);

    //使用ID定位输入框，并输入内容
    driver.findElement(By.id("kw")).sendKeys("id");

    Thread.sleep(2000);
    //使用name定位输入框，并输入内容
    driver.findElement(By.name("wd")).sendKeys("name");
    Thread.sleep(2000);









/*    //调用截图方法
    try {
      Tool.testScreenShot(driver);
    } catch (Exception e) {
      e.printStackTrace();
    }*/

  }
}



