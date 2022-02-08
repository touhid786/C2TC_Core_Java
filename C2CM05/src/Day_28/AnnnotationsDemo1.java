package Day_28;

import java.lang.annotation.Annotation;


@SmartTV(os = "Android",version = 2)
class LG{
	
	String model;
	int screensize;
	
	
	public LG(String model, int screensize) {
		this.model = model;
		this.screensize = screensize;
	}
	
	
}


public class AnnnotationsDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	LG obj=new LG("LG_ONE", 32);
	System.out.println(obj.model);
	System.out.println(obj.screensize);
	
	
	Class c1=obj.getClass();
    Annotation an=c1.getAnnotation(SmartTV.class);
    SmartTV st=(SmartTV)an;
    System.out.println(st.os());
    System.out.println(st.version());
    
    

	
	
	
	
	
	

	}

}
