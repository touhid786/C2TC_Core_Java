class Box{
	
	float width;
	float height;
	float depth;
	String color;
	

	
	float calcVol() {
		return this.width*this.height*this.depth;	
	}


}


public class BoxDemo {

	public static void main(String[] args) {

		Box box1=new Box();
		box1.width=3.4f;
		box1.height=4.2f;
		box1.depth=1.4f;
		
		float vol1=box1.calcVol();
		System.out.println(vol1);
		
		Box box2=new Box();
		box2.width=2.2f;
		box2.height=3.2f;
		box2.depth=5.8f;
		
		float vol2=box2.calcVol();
		System.out.println(vol2);
		
		System.out.println(box1.color="blue");
		
		
	

	}

}
