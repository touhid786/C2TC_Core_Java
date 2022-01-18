
public class StaticDemo {

	
	int a=10;
	int b;
	static int c=25;
	
	
	 void method1() {
		 //static int e=30;
		 //local variable cant be static
		System.out.println("The values are");
		System.out.println("a value is "+a);
		System.out.println("b value is"+b);
		System.out.println("c value is "+c);
	}
	
	static void method2() {
		int d=19;
		//System.out.println("d value is"+a);
		System.out.println("d value is"+d);
		System.out.println("c value is "+c);
	}
	
	static {
		System.out.println("Hii am in satic block");
	
		
	}
	
	static void mymethod() {
		System.out.println("blablabla");
	}
	
	
	public static void main(String[] args) {
		System.out.println("c value is"+StaticDemo.c);
		StaticDemo sd=new StaticDemo();
		sd.method1();
		StaticDemo.method2();
		
		
		

	}

}
