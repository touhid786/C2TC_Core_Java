package Day_24;

import java.util.Scanner;

public class Pattern_1 {

	public static void main(String args[]) {

		System.out.print("Enter the no of rows you want:");
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();

		for (int i = 0; i < rows; i++) {

			for (int j = 0; j <= i; j++) {
				System.out.print("@");

			}
			System.out.println();
		}

	}
}