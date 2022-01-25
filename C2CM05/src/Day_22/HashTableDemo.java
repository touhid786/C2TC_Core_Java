package Day_22;

import java.util.Hashtable;

//Hashtable Implements Map Interface & extends dictionary

//Properties of hastable
//1.Underlying data Structure is hashtable
//2.It doesn't maintain the order but it stored the
//values based on hashcode() of keys
//3.it doesnt allow duplicate keys but allows duplicate values
//4.it allows key and values as hetrogenous
//5.The key&values cannot be null 

//Constructor of hashtable
//1.Hashtable has 11 as by default capacity and 0.75 filled ratio
//2.You can change the intial capacity
//3.You can change the initail capacity with filled ratio
//4.You can convert map to hastable also

//When we have to go with hashtable
//when we have to perform for search.

//disadvantage 
//all the methods are SYNZ (one thread)

public class HashTableDemo {

	public static void main(String[] args) {
	
		Hashtable ht=new Hashtable(); //initial capactiy=11
	    ht.put(new Employee(10),"USA");
	    ht.put(new Employee(200),"IND");
	    ht.put(new Employee(100),"PAK");
	    ht.put(new Employee(50),"NZ");
	    ht.put(new Employee(300),"UK");
	    ht.put(new Employee(56),"CA");
	    
	    System.out.println("Hashtable contains"+ht);
	   
		

	}	
		
		
	}
	


class Employee{
	
	int empId;
	
	Employee(int empID){
		this.empId=empID;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return empId;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return empId+"";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
