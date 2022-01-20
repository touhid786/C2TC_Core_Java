package Day_21;

import java.util.HashSet;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class HashSetDemo {

	public static void main(String[] args) {
		
		HashSet<String> hs=new HashSet<String>();
		//TreeSet<String> hs =new TreeSet<String>();
		
		hs.add("Hash");
		hs.add("Set");
		hs.add("Demo");
		hs.add("Demo");
		hs.add(null);
		

//It does not allow duplicate values.
		//It can contain a single null value.
		
		Iterator i=hs.iterator();
		while(i.hasNext())
		{
			Object o=i.next();
			System.out.println(o);
		}
		

	}

}
