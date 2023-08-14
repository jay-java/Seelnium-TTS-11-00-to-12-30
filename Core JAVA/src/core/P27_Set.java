package core;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class P27_Set {
	public static void main(String[] args) {
		Set list = new HashSet();
		list.add(1);
		list.add("java");
		list.add(34.3);
		list.add(false);
		list.add('f');
		list.add(1);
		list.add(9876753);
		System.out.println(list);
		list.remove(3);
		System.out.println(list);
		list.add(45);
		System.out.println(list);
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
