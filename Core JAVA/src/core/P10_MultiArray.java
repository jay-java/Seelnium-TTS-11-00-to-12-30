package core;

public class P10_MultiArray {
	public static void main(String[] args) {
		int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
		for(int row= 0;row<=2;row++) {
			for(int col=0;col<=2;col++) {
				System.out.print(a[row][col]+" ");
			}
			System.out.println();
		}
	}
}
