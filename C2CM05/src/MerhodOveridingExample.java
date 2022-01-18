class Bank{
	
	float getRateofInterst() {
		return 6.7f;
	}
	
	
}

class SBI extends Bank{
	float getRateofInterst() {
		return 7.0f;
	}
}

class HDFC extends Bank{
	
	float getRateofInterst() {
		return 6.8f;
	}
}

class ICICI extends Bank{
	float getRateofInterst() {
		return 6.9f;
	}
}

public class MerhodOveridingExample {
	
	public static void main(String args[]) {
		
		SBI obj =new SBI();
		System.out.println(obj.getRateofInterst());
		
		//Dyanamic binding, assigning child class object to parent and 
		//getting the overriden mehtod of child 
		Bank obj1=new SBI();
		System.out.println(obj1.getRateofInterst());
	
	}
}
