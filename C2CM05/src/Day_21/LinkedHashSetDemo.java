package Day_21;

import java.util.Iterator;
import java.util.LinkedHashSet;

//Write a java program to implement LibinkedHastSet class

//LinkedHash set is same as Hashset but it maintain the insertion order.
//The elements of Linkedhash set are retrived in order they are inserted into the set.
//Duplication doesn't allow in HashSet
//Represtion in doubly linked list.


//HashSet implements Set
//Hash tables as internal data structure (faster)
//LinkedHashSet extends HashSet
//Elements are traversed by iterator according to the insertion order

//Properties of linkedhashset
//1.Underlying datastructure Hashtable+LinkedList
//2.Doesnt allow duplicates.
//3.Hetrogenous Objects
//4.null values allow
//5.Implements seriliazable and clonable

//Default capactiy of LinkedHashSet is 16.
//Default filled ratio is 0.75 


public class LinkedHashSetDemo {

	public static void main(String[] args) {
	
		//Creating HashSet and adding elements  
		
		
        LinkedHashSet<String> set=new LinkedHashSet();  
               set.add("One");    
               set.add("Two");    
               set.add("Three");   
               set.add("Four");  
               set.add("Five");  
               
               Iterator<String> i=set.iterator();  
               while(i.hasNext())  
               {  
               System.out.println(i.next());  
               }  
 }  
	}


