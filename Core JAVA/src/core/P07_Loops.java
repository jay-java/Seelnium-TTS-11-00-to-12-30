package core;
//4 Loops
//1.for(initialize;condition;incre/decre){body}
//2.while(condition){body}
//3.do{body} while(condition);
//4.for each(Type obj:multipledata){}
public class P07_Loops {
	public static void main(String[] args) {
		System.out.println("for loop start");
		for(int i=1;i<=10;i++) {
			System.out.println(i);
		}
		System.out.println("for loop end");
		System.out.println("while loop start");
		int j =1;
		while(j<=10) {
			System.out.println(j);
			j++;
		}
		System.out.println("while loop end");
		System.out.println("do while start");
		int k=1;
		do {
			System.out.println(k);
			k++;
		}
		while(k<=0);
		System.out.println("do while end");
		
	}
}
