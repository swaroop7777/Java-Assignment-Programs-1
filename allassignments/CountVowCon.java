package allassignments;

import java.util.Scanner;

public class CountVowCon {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.next();
		int vcount=0;
		int ccount=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='a'|| str.charAt(i)=='e'|| str.charAt(i)=='i'|| str.charAt(i)=='o'|| str.charAt(i)=='u'||str.charAt(i)=='A'|| str.charAt(i)=='E'|| str.charAt(i)=='I'|| str.charAt(i)=='O'|| str.charAt(i)=='U')
			{
				vcount++;
			}
			else 
			{
				ccount++;
			}
		}
		System.out.println("Vowels count:"+vcount+"\n"+"Consonent count:"+ccount);

	}

}
