package Day_22;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		
		
		HashMap<Integer,String> hashmap=new HashMap<Integer,String>();
		
	
		   //Creating HashMap   
		   hashmap.put(1,"Mango");  //Put elements in Map  
		   hashmap.put(2,"Apple");    
		   hashmap.put(3,"Banana"); 
		   hashmap.put(3,"Banana");   
		   hashmap.put(4,"Grapes");   
		   hashmap.put(null, null);
		   hashmap.put(null, "berry");
		   hashmap.put(5, null);
		       
		   System.out.println("Iterating Hashmap...");  

		
		for(Map.Entry m:hashmap.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
			
			
		}
		

	}

}
