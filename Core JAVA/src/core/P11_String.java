package core;
//String-> is sequence of characters
public class P11_String {
	public static void main(String[] args) {
//		char a[] = {'J','A','V','A'};
//		System.out.println(a);
		String name = "JAVA TECHNOLOGY";
		System.out.println(name);
		System.out.println(name.length());
		System.out.println(name.charAt(1));
		String name1 ="JAVA";
		System.out.println(name.concat(name1));
		System.out.println(name);
		String s1 = "java";
		String s2 = "java";
		if(s1.compareTo(s2)==0) {
			System.out.println("yes same");
		}
		else {
			System.out.println("not same");
		}
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareToIgnoreCase(s2));
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
	}
}
