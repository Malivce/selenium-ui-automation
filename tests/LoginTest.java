import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void testValidLogin() {
        driver.get("https://example.com/login");

        driver.findElement(By.id("email")).sendKeys("testuser@example.com");
        driver.findElement(By.id("password")).sendKeys("securePassword123");
        driver.findElement(By.id("login-button")).click();

        String expectedTitle = "Dashboard";
        String actualTitle = driver.getTitle();
        assert actualTitle.contains(expectedTitle) : "Login failed or dashboard not loaded";
    }
}
