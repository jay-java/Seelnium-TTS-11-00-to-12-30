package core;

import java.util.Scanner;

class TakeValue {
	public void call() {
		System.out.println("call method in take value class");
	}
}

public class P05_UserINput {
	public static void main(String[] args) {
		int a = 10, b = 20;
		System.out.println(a + b);
		TakeValue obj = new TakeValue();
		obj.call();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter i = ");
		int i = sc.nextInt();
		System.out.println("enter j = ");
		int j = sc.nextInt();
		System.out.println(i+j);
		System.out.println("enter d = ");
		double d = sc.nextDouble();
		System.out.println(d);
	}
}
