package SauceLogin;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginMain {
	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		WebDriver D1 = new ChromeDriver();
		D1.manage().window().maximize();
		
		D1.get("https://www.saucedemo.com//");
		System.out.println("1. Application Opened");
		
		Thread.sleep(5000);
			
		D1.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user"); 
		System.out.println("2. User Name Entered");
		
		D1.findElement(By.xpath("//*[@id=\"password\"]]")).sendKeys("secret_sauce");
		System.out.println("3. Password Entered");
				
		D1.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		System.out.println("4. Login Clicked");
		
		Thread.sleep(5000);
		
		try
		{
			D1.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]")).click();
			System.out.println("Login Successful");
			
			D1.findElement(By.xpath("//*[@id=\"react-burger-menu-btn\"]")).click();
			
			D1.findElement(By.xpath("//*[@id=\"logout_sidebar_link\"]")).click();
			
			System.out.println("Logout Clicked");					
		}
		catch (Exception x )
		{
			System.out.println("Login Fail");			
		}
		
		D1.quit();
	}
}