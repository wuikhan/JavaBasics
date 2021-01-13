package seleniumPackage;

import java.util.Set;

import org.openqa.selenium.Cookie;

public class Day14_Cookies extends Utilities {

	public static void main(String[] args) {
		openBrowser("chrome", "https://www.cnn.com");
		
		Set<Cookie> siteCookies = driver.manage().getCookies();
		System.out.println("Before Deleting Cookie : " +siteCookies.size());
		
		for(Cookie singleCookie : siteCookies) {
			String cookieName = singleCookie.getName();
			String cookieValue = singleCookie.getValue();
			System.out.println("Cookie Name: "+cookieName);
			System.out.println("Cookie Value: "+cookieValue);
		}
		
		//driver.manage().deleteCookieNamed("usprivacy");
		driver.manage().deleteAllCookies();
		Set<Cookie> siteCookies2 = driver.manage().getCookies();
		System.out.println("After Deleting Cookie : " +siteCookies2.size());
		
		for(Cookie afterDel : siteCookies2) {
			System.out.println(afterDel.getName());
		}
		
		Cookie addCookie = new Cookie("codegator","123456");
		driver.manage().addCookie(addCookie);
		
		Set<Cookie> siteCookies3 = driver.manage().getCookies();
		System.out.println("After Adding a new Cookie : " +siteCookies3.size());
		
		for(Cookie newCookie : siteCookies3)
		{
			System.out.println(newCookie.getName() + newCookie.getValue());
		}
		
		
		
	}

}
