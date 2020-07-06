package allassignments;

import java.util.Scanner;

public class PrintEvenPosRep {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter String:");
	String inp=sc.nextLine();
	char[] ch=new char[(inp.length()/2)];
	int k=0;
	for(int i=0;i<inp.length();)
	{
		ch[k]=inp.charAt(i);
		k++;
		i=i+2;
	}
	String str="";
	for(int i=1;i<inp.length();)
	{
	str=str+inp.charAt(i);
	i=i+2;
	}
	
	for(int i=0;i<ch.length;i++)
	{
		
		if(i%2==1) 
		{
			for(int j=1;j<=Integer.parseInt(""+str.charAt(i));j++)
				{
					System.out.print(ch[i]);
				}
			System.out.println();
		}
		else
		{
			System.out.println(ch[i]);
		}
	}
	}

}



