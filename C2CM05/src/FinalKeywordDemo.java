class car{
	final int max_speed=120;
	
	void controlSpeed() {
		//max_speed=180;
		System.out.println(max_speed);
	}
}

public class FinalKeywordDemo {
	
	
	
	public static void main(String args[]) {
	    car c=new car();
		c.controlSpeed();
		
	}

}
