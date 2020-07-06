package allassignments;
import java.util.Scanner;

public class SortAscEvenDesOdd {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter No. Of Values You Want to Enter Into String.");
	int n=sc.nextInt();
	String[] s=new String[n];
	System.out.println("Enter values:");
	for(int i=0;i<s.length;i++)
	{
		s[i]=sc.next();
	}
	//Creating Necessary Spaces For Arrays Using oddpos and evenpos variables.
	int oddposcnt=0;
	int evenposcnt=0;
	for(int i=0;i<s.length;i++)
	{
		if(i%2==0)
		{
			oddposcnt++;
		}
		else
		{
			evenposcnt++;
		}
	}
	//created arrays and used two variables initialized to 0 to store that String Array 's' Values in Integer format to a and b Arrays.
	int[] a=new int[oddposcnt];
	int[] b=new int[evenposcnt];
	int k=0;
	int j=0;
	for(int i=0;i<s.length;i++)
	{
		if(i%2==0)
		{
			a[k]=Integer.parseInt(s[i]);
			k++;
		}
		else
		{
			b[j]=Integer.parseInt(s[i]);
			j++;
		}
	}
	//Sorting two Arrays Obtained Till Now.
	//ascending Sort for Even Position Elements In the String
	for(int i=0;i<b.length;i++)
	{
		for(int y=i+1;y<b.length;y++)//j has been used as a instance variable already. so using 'y'.
		{
			if(b[i]>b[y])
			{
			int temp=b[i];
			b[i]=b[y];
			b[y]=temp;
			}
		}
	}
	for(int i=0;i<b.length;i++)
	System.out.print(b[i]+" ");
	System.out.println();

	//Descending sort for Odd Position Elements.
	for(int i=0;i<a.length;i++)
	{
		for(int y=i+1;y<a.length;y++)//j has been used as a instance variable already. so using 'y'.
		{
			if(a[i]<a[y])
			{
			int temp=a[i];
			a[i]=a[y];
			a[y]=temp;
			}
		}
	}
	for(int i=0;i<a.length;i++)
	System.out.print(a[i]+" ");
	}

}
