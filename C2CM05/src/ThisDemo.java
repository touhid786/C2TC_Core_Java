class Animal{
	int legs;
	String name;
	String color;
	
	public Animal() {
		System.out.println("This is default Constructor");
	}
	public Animal(String name) {
		this();
		this.name = name;
	}
	public Animal(String name, String color) {
		this(name);
		this.color = color;
	}
	public Animal(int legs, String name, String color) {
		this(name,color);
		this.legs = legs;
	}
	void display() {
		System.out.println("Animal Description: ");
		System.out.println("Animal Name = "+name+"\n"+"Animal Color = "+color+"\n"+"Animal Legs = "+legs);
	}
}
public class ThisDemo {

	public static void main(String[] args) {
		Animal obj1 = new Animal(4,"Cat","White");
		obj1.display();
		Animal obj2 = new Animal("Dog","Brown");
		obj2.display();
		Animal obj3 = new Animal("Tiger");
		obj3.display();
	}

}