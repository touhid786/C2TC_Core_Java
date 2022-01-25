package Day_24;


class TraverseString{
	
	
	public void traverse(String str) {
		
		for (int i = 0; i < str.length(); i++) {
			 
		       
	        System.out.println(str.charAt(i) + " ");
	        try{
	        	Thread.sleep(500);
	        }
	        catch(Exception e) {
	        	
	        }
	    }
	}
	
	
}



public class HelloThread {

	public static void main(String[] args) {
		
		String str = "Hello World";
       
		TraverseString st=new TraverseString();
		st.traverse(str);
     
		

	}

}
