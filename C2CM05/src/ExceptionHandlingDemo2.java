
public class ExceptionHandlingDemo2 {

	public static void main(String[] args) {
	
		int[] arr=new int[4];
		int a=45;
		int b=0;
		
		
		try {
			
		arr[4]=35;
		int c=a/b;
	
		System.out.println("In a try blockk");
			
		}
		
		catch(ArrayIndexOutOfBoundsException ae) {
			
			ae.printStackTrace();
			System.out.println("Exception in try block");
		}
		
        
		catch(Exception e) {
			e.printStackTrace();
			
		}
		
		
		
		
		
		finally {
			
			System.out.println("In a finally block");
		}
		
		//You can write multiple catch statements for different types of exception like arithmetic,ArrayBoundofIndex
		//(Exception e)
		
		System.out.println("In the class");

	}

}
