package core;

import java.util.Scanner;

//array -> is group of elements of same data type into single variable
//1.single dimensional
//2.Multi dimensional
public class P09_Array {
	public static void main(String[] args) {
		int i =1;
		System.out.println(i);
		int a[] = {1,2,3,4,5,6,7,8,9,10};
		for(int index=0;index<a.length;index++) {
			System.out.println(a[index]);
		}
		Scanner sc = new  Scanner(System.in);
		System.out.print("enter size of array :");
		int size = sc.nextInt();
		int arr[] = new int[size];
		for(int index=0;index<arr.length;index++) {
			System.out.print("enter element at index arr["+index+"] : ");
			arr[index] = sc.nextInt();
		}
		int sum =0;
		for(int index=0;index<arr.length;index++) {
			sum = sum +arr[index];
		}
		System.out.println("sum of elements is : "+sum);
		
		System.out.println("enter number to search in array : ");
		int num = sc.nextInt();
		int counter = 0;
		for(int index=0;index<arr.length;index++) {
			if(num == arr[index]) {
				counter++;
			}
		}
		if(counter>0) {
			System.out.println("yes "+num+" is exist "+counter+" times");
		}
		else {
			System.out.println("not");
		}
	}
}
