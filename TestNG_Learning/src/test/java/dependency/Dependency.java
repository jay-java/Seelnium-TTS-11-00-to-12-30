package dependency;

import static org.testng.Assert.assertFalse;

import org.testng.annotations.Test;

public class Dependency {
	@Test
	public void login() {
		System.out.println("login fun");
		assertFalse(true);
	}
	@Test(dependsOnMethods = "login")
	public void totalFR() {
		System.out.println("tptal FR fun");
	}
	@Test(dependsOnMethods = "totalFR")
	public void acceptFR() {
		System.out.println("accept FR");
	}
	@Test(dependsOnMethods = "acceptFR")
	public void logout() {
		System.out.println("logout Fun");
	}
}
