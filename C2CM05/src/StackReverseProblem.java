import java.util.ArrayList;
import java.util.Stack;

public class StackReverseProblem {

	public static void main(String[] args) {
	
		String str="abcd";
		//problem reverse the string
		
		Stack<String> stack =new Stack();
		
		stack.push("a");
		stack.push("b");
		stack.push("c");
		stack.push("d");
		
		System.out.println(stack);
		
		ArrayList<String> list=new ArrayList();
		
		for(var i = 0;i<4;i++) {
			
			var reverse=stack.pop();
		
		    list.add(reverse);
			
		}
		System.out.println(list);
		
	
	
//		var reverse=stack.pop();
//		var reverse1=stack.pop();
//		var reverse2=stack.pop();
//		var reverse3=stack.pop();
//		System.out.println(reverse+reverse1+reverse2+reverse3);
//		

	}

}
