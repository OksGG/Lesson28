import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YandexHelloTest {
    private WebDriver webDriver;

    @Test
    public void helloYandex(){
WebDriverManager.chromedriver().setup();
webDriver = new ChromeDriver();
webDriver.get("https://yandex.ru/");
        WebElement searchInput = webDriver.findElement(By.id("text"));
        searchInput.sendKeys("Hello World");
        searchInput.submit();
        String title = webDriver.getTitle();
        Assert.assertTrue(title.contains("Hello World"));

    }
    @After
    public void close(){
        if(webDriver!=null){
            webDriver.quit();
            }
        }
    }

