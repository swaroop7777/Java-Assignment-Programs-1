package allassignments;

import java.util.Arrays;
import java.util.Scanner;

public class BalanceString {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter string with alphabets:");
	String s=sc.nextLine();
	char[] temp=s.toCharArray();
	Arrays.sort(temp);
	String str="";
	if(s.length()==1) {
		System.out.println(s);
		System.exit(0);
	}
	l1:
	for(int i=0;i<temp.length;i++)
	{
		for(int j=i+1;j<s.length();j++)
		{

			if(temp[i]!=temp[j])
			{
				str+=temp[i];
				i=j-1;
				continue l1;
		
			}
			else
			{
				i=j;
				continue l1;
			}

		}
		if(i==temp.length-1)
		{
			str+=temp[i];
		}
	}
	if(str=="")
	{
		System.out.println(0);
	}

	System.out.println(str);
 }
}
