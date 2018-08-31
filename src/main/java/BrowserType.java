import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserType {

    public static WebDriver openChrome(){

        System.setProperty("webdriver.chrome.driver", ".\\geckodriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        return driver;

    }

    public static WebDriver openIE(){

        System.setProperty("webdriver.ie.driver", ".\\geckodriver\\IEDriverServer.exe");
        WebDriver driver = new InternetExplorerDriver();
        return driver;

    }

    public static WebDriver openFireFox(){

        System.setProperty("webdriver.gecko.driver", ".\\geckodriver\\geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        return driver;

    }
}
