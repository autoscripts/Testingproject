package primus;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\javamrng\\jarfiles and drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	    //System.setProperty("webdriver.gecko.driver","E:\\javamrng\\jarfiles and drivers\\geckodriver-v0.29.1-win64\\geckodriver.exe");
        //WebDriver dr = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://youtube.com");
		Thread.sleep(3000);
		driver.close();
		//comment
		//comment2
		//dr.close();
	}
}
