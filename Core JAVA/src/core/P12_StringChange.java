package core;

public class P12_StringChange {
	public static void main(String[] args) {
		StringBuffer s = new StringBuffer("JAVA");
		s.append(" TECHNOLOGY");
		System.out.println(s.length());
		
		StringBuilder s1 = new StringBuilder("java");
		s1.append(" TECHNOLOGY");
		System.out.println(s1);
	}
}
