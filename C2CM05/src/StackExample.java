/*
 1)What is Stack?

-The stack is a linear data structure that is used to store the collection of objects

-we use array or linked list to stored the objects in a stack 

-A stack is a wrapper around array and linked list that gives  a different way storing and accessing objects.

-LIFO principle

Applciations of Stack

Implement the undo feature
Build compilers (eg syntax checking)
Evaluate expression (eg 1+2/3)
Build Navigation(eg forward/back)



Stack Operation

push(item)-which adds items on the top
pop()-which removes items on the top
peek()-whcih remove items on the top without removing from it from the stack
isEmpty()-which tells the stack is empty or not.

What is generic class? 
here we can store any types of objects,cusotm objects ,integer,String etc

 */
import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
	
		Stack<Integer> stack =new Stack<>();
		stack.push(10);
		stack.push(20);
		stack.push(30);
	    System.out.println(stack);
	    var pop=stack.pop();
	    System.out.println(pop);
	    System.out.println("After Poping "+stack);
	    var top_without_delete=stack.peek();
	    System.out.println(top_without_delete);
	    
		
	}

}
