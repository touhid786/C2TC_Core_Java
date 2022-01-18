import java.util.ArrayList;
import java.util.Vector;

//what is vector?
//
//Vector introduced in jdk 1.0. Vector is type of list which implement list same as array list.
//It is dynamic array in which you can increased size of array. vector increased size by 100%.
//
//what is difference between ArrayList and Vector?
//Vector   : 1) when exceed array limit it will increased capacity by 100%. It waste lots of memory.
//    2) Vector is thread safe.
//    3) It is slow.    
//
//ArrayList : 1) when exceed array limit it will increased capacity by 50%. It save memory.
//    2) ArrayList is not thread safe.
//    3) It is fast. 

class ArrayListVsVector {

	public static void main(String[] args) {
		 	
		Vector v=new Vector();
		System.out.println(v.capacity());
//		v.add(2);
//		v.add(6);
//		v.add(2);
//		v.add(6);
//		v.add(6);
//		v.add(2);
//		v.add(6);
//		v.add(2);
//		v.add(6);
//		v.add(6); // till here limit 10
//		v.add(9); //vector increased the size by 100%
//		System.out.println(v.capacity());
		
		
//       ArrayList a=new ArrayList<>();
//       a.add(2);
//       a.add(5);
//       a.add(6);
//       a.add(9);
//       a.add(7);
//       a.add(2);
//       a.add(5);
//       a.add(6);
//       a.add(9);
//       a.add(7);
//       a.add(7);
//       System.out.println(a.size());
//   	 
	
		

	}

}
