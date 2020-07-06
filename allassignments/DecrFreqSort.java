package allassignments;

import java.util.Scanner;

public class DecrFreqSort {
	static int rowIndex=0;
	static int count=0;
	public static void main(String[] args) {
		//input--[4,3,1,6,4,3,6,4]
		//output--[4,4,4,3,3,6,6,1]-->
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many values you want in the array?");
		int[] a=new int[sc.nextInt()];
		int[][] b=new int[a.length/2][2];
		int i=0;
		while(i<a.length)
		{
			a[i]=sc.nextInt();
			i++;
		}
		sc.close();
		//Sort the array
		a=sort(a);
		//Store into 2D array with occurences
		int colIndex=0;
		int loop=0;
		for(loop=0;loop<a.length-1;loop++)
		{
			
			if(a[loop]!=a[loop+1])
			{
			 b[rowIndex][colIndex]=a[loop];
			 b[rowIndex][colIndex+1]=++count;
			 rowIndex++;
			 count=0;
			}
			else
			{
			 b[rowIndex][colIndex]=a[loop];
			 b[rowIndex][colIndex+1]=++count;
			}
			
		}
		if(loop==a.length-1 && a[a.length-1]==a[a.length-2])
		{
		 b[rowIndex][colIndex+1]=++count;
		}
		else {
		b[rowIndex][colIndex]=a[a.length-1];
		 b[rowIndex][colIndex+1]=count;
		}
		//After Storing Occurences,Swap 1D arrays present in 2D array based on Occurences
		b=sort(b);//overloaded for 2D arrays
		for(int k=b.length-1;k>=0;k=k-1)
		{
		   int count=b[k][1];
		   while(count!=0)
		   {
			 System.out.print(b[k][0]+" ");
			 count--;
		   }
		   System.out.println();
		}
	}

	private static int[][] sort(int[][] b) {
		for(int i=0;i<b.length;i++)
		{
		  for(int j=i;j<b.length;j++)
		  {
			 if(b[i][1]>b[j][1])
			 {
				int temp[];
				temp=b[i];
				b[i]=b[j];
				b[j]=temp;
			 }
		  }
		}
		return b;
	}

	private static int[] sort(int[] a) {
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=0;
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		return a;
	}
}
