class Student
{
	int id;
	String name;
	String course;
	String email;	
	Student()
	{	
	}
	public Student(int id, String name, String course, String email) {
		
		this.id = id;
		this.name = name;
		this.course = course;
		this.email = email;
	}
	
	public void display()
	{
		System.out.println("Student information:");
		System.out.println(id+" "+name+" "+course+" "+email);
	}
}

public class ConstructorExample {

	public static void main(String[] args) {
		Student s1=new Student();
		s1.id=1;
		
        s1.name="Gayatri";
		s1.course="java";
		s1.email="adhfhg";
		s1.display();
		
//		Student s2=new Student(2,"Rachana","BSc","ahgdfkah");
//		s2.display();
	}

}