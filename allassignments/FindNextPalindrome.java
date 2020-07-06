package allassignments;

import java.util.Scanner;

public class FindNextPalindrome {

	public static void main(String[] args) {
		System.out.println("Enter the palindrome number:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		int quo=-1,rem=-1,i=0;
		while(quo/10!=0)
		{
		  quo=n/10;
		  rem=n%10;
		  a[i]=quo;
		}
		
	}

}
