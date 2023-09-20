package eshop;

import org.testng.annotations.Test;

public class Product {
	@Test
	public void searchProduct() {
		System.out.println("search product");
	}
	@Test
	public void fileteProduct() {
		System.out.println("fileter product");
	}
	@Test(groups = "smoke")
	public void addtoWishList() {
		System.out.println("add to wishlist");
	}
	@Test(groups = "purchase")
	public void addToCart() {
		System.out.println("add to cart");
	}
	@Test
	public void removeFromVart() {
		System.out.println("remove from cart");
	}
}
