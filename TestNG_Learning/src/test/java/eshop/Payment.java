package eshop;

import org.testng.annotations.Test;

public class Payment {
	@Test(groups = "smoke")
	public void COD() {
		System.out.println("Cash on delivery");
	}
	@Test(groups = "purchase")
	public void creditCard() {
		System.out.println("credit card");
	}
	@Test
	public void debitCart() {
		System.out.println("debit card");
	}
	@Test
	public void UPI() {
		System.out.println("UPI payment");
	}
}
