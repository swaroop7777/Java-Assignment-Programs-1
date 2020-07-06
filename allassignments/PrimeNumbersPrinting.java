package allassignments;

import java.util.Scanner;

public class PrimeNumbersPrinting {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n:");
		int n = sc.nextInt();
		System.out.println(isprime(n) ? "prime" : "Not prime");
		}
	public static boolean isprime(int i) {
		if (i == 1) {
			return false;
		}
		if (i == 2) {
			return true;
		}
		if (i % 2 == 0) {
			return false;
		}
		for (int j = 3; j < i; j += 2) {
			if (i % j == 0) {
				return false;
			}	
		}
		return true;

	}
}
