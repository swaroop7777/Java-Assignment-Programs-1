package allassignments;
import java.util.Arrays;
import java.util.Scanner;

public class EqualPairs {
	EqualPairs()
	{
		super();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many values you want in an Array?");
		int n = sc.nextInt();
		int No_Of_Pairs = 0;
		int[] a= new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		l1: for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					No_Of_Pairs += 1;
					i = i + 1;
					continue l1;
				}
				else 
				{
					continue l1;
				}
			}
		}
		System.out.println("No. of Equal Pairs:" + No_Of_Pairs);
	}
}
