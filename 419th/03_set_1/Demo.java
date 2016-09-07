

import java.util.Set;
import java.util.HashSet;

public class Demo {
	public static void main(String args[]){
//		HashSet<String> hashSet = new HashSet<String>();
//		Set<String> set = hashSet;
		Set<String> set = new HashSet<String>();
		boolean b1 = set.isEmpty();
		System.out.println(b1);

		set.add("a");
		set.add("b");
		set.add("c");
		set.add("d");
		set.add("c");

		boolean b2 = set.isEmpty();
		System.out.println(b2);
		int i = set.size();
		System.out.println("clear之前set对象的长度是"+i);
	//	set.clear();
		set.remove("a");
		int j = set.size();
		System.out.println("clear之后set对象的长度是"+j);
	}	
}

