class Base{
	
	static int i;
	
	static void m1() {
		i=10;
		System.out.println("Hi in a base class");
	}
}

class Derived1 extends Base{
	
	int j;
	
	void m2() {
		System.out.println("Hi in a derived1 class");
	}
}

class Derived2 extends Base{
	int k;
	void m3() {
		System.out.println("Hi in a  derived2 class");
	}
}

class Derived3 extends Base{
	int l;
	void m4() {
		System.out.println("Hi in a derived3 class");
	}
}

class Derived4 extends Derived1{
	int m;
	void m5() {
		System.out.println("Hi in a derived4 class");
	}
}


public class HierarchicalInheritanceDemo {
	
	public static void main(String args[]) {
		
		Derived1 d1=new Derived1();
		Base.m1(); //calling static method of base class
		d1.m2();  //calling derived1 class method m2
		Derived2 d2=new Derived2();
		d2.m1(); //accessing base class method
		d2.m3();//calling derived2 class method m3
		Derived4 d4=new Derived4();
		
		d4.m1(); //hierarchial
		
		d4.m2();
		d4.m5();
		
	}
	

}
