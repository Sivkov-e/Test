import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class VendorListTest {
    private WebDriver driver;

    @BeforeEach
    public void setUp() {
        String webDriverPath = "/opt/homebrew/bin/chromedriver";
        System.setProperty("webdriver.chrome.driver", webDriverPath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void testOpenConsolePageAndVerifyElements() throws IOException {
        String mainPageURL = "https://opm-website.iot-asm-test1.insitech.live";
        driver.get(mainPageURL);

        WebElement consoleButton = driver.findElement(By.xpath("//span[contains(text(),'Консоль')]"));
        consoleButton.click();

        List<WebElement> listOfVendors = driver.findElements(By.xpath("//*[@id=\"manufacturers-infinite-scroll\"]"));
        String expectedlistOfVendoes = new String(Files.readAllBytes(Paths.get("src/test/resources/expectedText.txt"))).trim();

        assertEquals(expectedlistOfVendoes, listOfVendors, "Текст элемента не соответствует ожидаемому");
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}