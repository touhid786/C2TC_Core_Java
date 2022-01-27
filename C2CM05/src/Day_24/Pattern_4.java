package Day_24;

import java.util.Iterator;
import java.util.Scanner;

public class Pattern_4 {

	public static void main(String[] args) {

		System.out.println("Enter the no of lines you want:");

		Scanner sc = new Scanner(System.in);

		int lines = sc.nextInt();
		int mid = (lines + 1) / 2;

		// upper part
		for (int i = 1; i <= mid; i++) {

			// for space
			for (int s = 1; s <= (mid - i); s++) {
				System.out.print(" ");
			}

			// for star

			for (int j = 1; j <= (i * 2 - 1); j++) {
				System.out.print("*");
			}

			System.out.println();
		}

		// lower part
		for (int i = 1; i <= (mid - 1); i++) {

			// for space
			for (int s = 1; s <= i; s++) {
				System.out.print(" ");
			}

			// for star
			for (int j = 1; j <= 2 * (mid - i) - 1; j++) {

				System.out.print("*");
			}

			System.out.println();

		}

	}

}