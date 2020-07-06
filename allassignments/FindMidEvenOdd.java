package allassignments;

import java.util.Scanner;

public class FindMidEvenOdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of values you want in an array:");
		int n=sc.nextInt();
		int[] a = new int[n];
		int[] b=new int[n+1];
		System.out.println("Enter values to Array:");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		if(a.length%2!=0)
		{
			System.out.println("Mid Element is:"+a[a.length/2]);
		}
		else
		{
			b[0]=0;
			for(int i=1;i<=a.length;i++)
			{
				b[i]=a[i-1];
			}
			System.out.println("Mid element is:"+b[b.length/2]);
		}

	}
}
