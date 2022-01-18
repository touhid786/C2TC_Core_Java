abstract class Bank1{
	abstract float getRateOfInterest();
	void display() {
		System.out.println("Abstarct Class Base1");
	}
}
class SBI1 extends Bank1{

	@Override
	float getRateOfInterest() {
		return 7.0f;
	}
}
class HDFC1 extends Bank1{
	float getRateOfInterest() {
		return 6.8f;
	}
}
class ICICI1 extends Bank1{
	float getRateOfInterest() {
		System.out.println("This is ICICI1 class");
		return 6.9f;
	}
}

public class AbstractionDemo {

	public static void main(String[] args) {
		Bank obj1 = new SBI();
		System.out.println(obj1.getRateofInterst());
		Bank obj2 = new ICICI();
		System.out.println(obj2.getRateofInterst());
		SBI obj = new SBI();
		System.out.println(obj.getRateofInterst());
	}
}