package guvi;

import java.util.Scanner;

public class Pattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, j, c = 1;
		int n = sc.nextInt();
		// System.out.println("Enter Number of Terms");
		for (i = 1; i <= n; i++) {
			for (j = 1; j <= i; j++) {
				System.out.print(c++ + " ");

			}
			System.out.println();
		}

	}
}
