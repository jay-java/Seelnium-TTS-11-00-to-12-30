package core;

import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

//Exception -> exception is abnormal situation occurs at runtime
//			->Types 1.Checked (class directly inherit throwable)
//					2.Unchecked (class directly inherit runtime) 
//					(As oracle 3.Error)
//			->To handle exception 5 keyword
//			->1.Try 2.Catch 3.Finally 4.Throw 5.Throws
class Divide {// B
	Scanner sc = new Scanner(System.in);
	public void division() throws ArithmeticException, InputMismatchException {
		System.out.println("enter a = ");
		int a = sc.nextInt();
		System.out.println("enter b = ");
		int b = sc.nextInt();
		int c = a / b;
		System.out.println(c);
	}
	public void takeNumber() {
		System.out.println("enter num : ");
		int num = sc.nextInt();
		if(num>0) {
			System.out.println(num);
		}
		else {
			throw new ArithmeticException("");
		}
	}
}

public class P22_Exception {// A
	public static void main(String[] args) {
		try {
			Divide d = new Divide();
			d.division();
		} catch (ArithmeticException e) {
			System.out.println("number cannot divide by zero");
		} catch (InputMismatchException e) {
			System.out.println("denominator should be numeric");
		}

//		try {
//			Scanner sc = new Scanner(System.in);
//			System.out.println("enter a = ");
//			int a = sc.nextInt();
//			System.out.println("enter b = ");
//			int b = sc.nextInt();
//			int c = a / b;
//			System.out.println(c);
//		}
//		catch (ArithmeticException e) {
//			System.out.println("number cannot divide by zero");
//		} catch (InputMismatchException e) {
//			System.out.println("denominator should be numeric");
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		finally {
//			System.out.println("this will executes everytime");
//		}
	}
}
