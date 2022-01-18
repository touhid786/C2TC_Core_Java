import java.util.Enumeration;
import java.util.Vector;

class student3{
	int id;
	String name;
	int grade;
	
	
	public student3(int id, String name, int grade) {
		
		this.id = id;
		this.name = name;
		this.grade = grade;
	}






@Override
	public String toString() {
		return "student3 [id=" + id + ", name=" + name + ", grade=" + grade + "]";
	}

}




public class VectorDemo {
	
	public static void main(String args[]) {
		
		Vector v=new Vector();
		student3 s1=new student3(101, "Harry", 10);
		student3 s2=new student3(102, "Harry", 10);
		v.addElement(s1);
        v.addElement(s2);
        v.addElement("999");
        v.addElement("999");
        
        Enumeration e=v.elements();
        while(e.hasMoreElements()) {
        	Object o=e.nextElement();
        	System.out.println(o);
        }
		
		
		
		
	}
	
}
	

	
	

