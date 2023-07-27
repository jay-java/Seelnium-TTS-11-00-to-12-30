package core;

//Unary -> ++, --
//Arithmetic -> +,-,*,/,%
//Relational -> >,<,>=,<=
//Logical -> && , ||
//Assignment -> =,!=
public class Operators {
	public static void main(String[] args) {
		int i = 4;
		i--; // i = i+1
		System.out.println(i);
		int a = 10, b = 3;
//		b = a++;
//		System.out.println(b);
//		System.out.println(a);
		System.out.println(a % b);

		a += b; // a = a+b
		System.out.println(a);
		
		
		int c = 50,d=-20;
		c =+ d;
		System.out.println(c);
		
	}
}
