package eshop;

import org.testng.annotations.Test;

public class User {
	@Test(groups = "smoke")
	public void register() {
		System.out.println("register user");
	}
	@Test(groups = {"purchase","smoke"})
	public void login() {
		System.out.println("login user");
	}
	@Test
	public void manageProfile() {
		System.out.println("profile manage");
	}
	@Test
	public void logout() {
		System.out.println("logout");
	}
	
}
