package Day_24;

import java.util.Scanner;

public class Pattern_2 {

	public static void main(String args[]) {

		System.out.print("Enter the no of rows you want:");
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();

		for (int i = 0; i <= rows; i++) {

			for (int j = 1; j <= rows - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
