

import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class Demo {
	public static void main(String args[]){
		Set<String>set = new HashSet<String>();
	// Iterator			Collection		Set		HashSet
	//									List	ArrayList
	// hasNext()		next()
		set.add("s");
		set.add("b");
		set.add("c");
		set.add("d");
		set.add("e");

		Iterator<String> it = set.iterator();
		while(it.hasNext()){
			String s = it.next();
			System.out.println(s);
		}
	}
}

