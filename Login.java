package seleniumPrograms;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.edge.EdgeDriver;

public class Login {
	 public static void main(String [] args) {

		 WebDriver driver=new EdgeDriver();
		 driver.navigate().to("https://accounts.saucelabs.com/");  
		 driver.findElement(By.id("user-name")).sendKeys("standard_user");
		 driver.findElement(By.id("password")).sendKeys("secret_sauce");
		    driver.findElement(By.xpath("login-button")).click(); 
		    driver.close();
	 }
}
