package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A, B, Total;

		A = sc.nextInt();
		B = sc.nextInt();

		Total = A * B;
		System.out.println("PROD = " + Total);

		sc.close();

	}

}
