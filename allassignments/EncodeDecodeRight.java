package allassignments;

import java.util.Scanner;

class EncodeDecodeRight
{
	
	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String s=sc.nextLine();
		System.out.println("How many places you want to shift?");
		int sh=sc.nextInt();
		char[] a=s.toCharArray();
		char[] enc=new char[s.length()];
		int j=0;
		int k=0;
		for (char i:a)
		{
			if((i>=(97) && i<=122-sh) || (i>=(65) && i<=90-sh))
			{
				enc[j]=(char)(i+sh);
				j++;
			}
			else if(i>122-sh && i<=122 || i>90-sh && i<=90){
				enc[j]=(char) ((i-25)+sh-1);
				j++;
				k++;
			}
			else {
				enc[j]=i;
				j++;
			}
		}
		for (char i:enc)
		{
			System.out.print(i+" ");
		}

		
		
	}
		
}


