package MavenDemo.MavenDemo;

import static org.testng.Assert.assertTrue;

import org.testng.Reporter;
import org.testng.annotations.Test;

/**
 * Unit test for simple app.
 */

public class AppTest extends BaseTestClass{
	
	@Test
	public void loginTestCase() throws InterruptedException
	{
		
		log.logInZerodha();
		Reporter.log("maven demo project------",true);
		assertTrue( true );
	}
	
	

}
