package tests;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.TestBase;

public class DemoCookies extends TestBase {
	
	@Test
	public void cookieDemo() {
		Set<Cookie>mycookies = driver.manage().getCookies();
		System.out.println(mycookies.size());
		for(Cookie s:mycookies) {
			System.out.println(s.getDomain());
			System.out.println(s.getPath());
			System.out.println(s.getExpiry());
			System.out.println(s.getValue());
		}
		Cookie ck = new Cookie("a", "123214");
		driver.manage().addCookie(ck);
		Set<Cookie>mynewcookies = driver.manage().getCookies();
		System.out.println(mynewcookies.size());
				
	}
	
	@BeforeTest()
	public void setup() {
		getBrowser(null);
	}

}
