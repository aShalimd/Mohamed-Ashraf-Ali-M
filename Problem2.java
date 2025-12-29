package Tandemloop;

import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter series length: ");
		int length = sc.nextInt();

		System.out.print("Enter starting value: ");
		int start = sc.nextInt();

		for (int i = 0; i < length; i++) {
			System.out.print(start + " ");
			start += 2;
		}

		sc.close();
	}
}
