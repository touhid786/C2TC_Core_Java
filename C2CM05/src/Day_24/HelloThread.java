package Day_24;

import java.util.Scanner;

class TraverseString {

	public void traverse(String str) {

		System.out.print("Your name is:");

		for (int i = 0; i < str.length(); i++) {

			System.out.print(str.charAt(i));

			try {
				Thread.sleep(500);
			} catch (Exception e) {

			}
		}

	}

}

public class HelloThread {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter your name:");

		String str = sc.nextLine();

		TraverseString st = new TraverseString();
		st.traverse(str);

	}

}
