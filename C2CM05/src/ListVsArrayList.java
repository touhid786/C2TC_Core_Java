import java.util.ArrayList;
import java.util.List;

public class ListVsArrayList {

	public static void main(String[] args) {
		
		int arr[]= new int[5]; //declaration and instantiation  
		
	// List<Integer> intlist=new List<>();
		
		List<Integer> intlist=new ArrayList<>(5);
		intlist.add(2);
		intlist.add(5);
		intlist.add(6);
		intlist.add(2);
		intlist.add(5);
		intlist.add(6);
		intlist.add(2);
		intlist.add(5);
		intlist.add(6);
		System.out.println(intlist.size());
		
		//list is an interface
	 
	 ArrayList<Integer> arraylist=new ArrayList<>(5);
	 
		
		
	}

}
