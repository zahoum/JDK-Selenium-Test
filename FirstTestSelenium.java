import io.github.bonigarcia.wdm.WebDriverManager;
import org.openga.selenium.WebDriver;
import org.opengs.selenium.chrome.ChromeDriver;

public class FirstTest{
    public static void main(String[] args){
        
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new chromedriver();
        driver.manage().window().maximize();

        //open the Chrome browser and navigate to the URL
        WebDriver.get('https://www.demoblaze.com');

        //show the title of page to check if it's every things good 
        System.out.println('page Title is :'+driver.getTitle());

        //close the brouwser with finishing \
        driver.quit();
    }
}