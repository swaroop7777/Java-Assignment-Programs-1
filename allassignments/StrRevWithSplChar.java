package allassignments;

import java.util.Scanner;

public class StrRevWithSplChar {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String s=sc.nextLine();
		String res="";
		String resfin="";
		char[] ch=new char[s.length()];
		int k=0;
		for(int i=0;i<s.length();i++)
		{
			if(!(  (s.charAt(i)>=65 && s.charAt(i)<=90) || (s.charAt(i)>=97 && s.charAt(i)<=122) ))
			{
				res=res+s.charAt(i);
			}
			else {
				res=res+" ";
				ch[k]=s.charAt(i);
				k++;
			}
			
		}
		char[] finres=res.toCharArray();
		int var=k-1;
		for(int i=0;i<finres.length;i++)
		{
			if(finres[i]==' ')
			{
				finres[i]=ch[var];
				var--;
			}
		}
		for(int i=0;i<finres.length;i++)
		{
			System.out.print(finres[i]);
		}


	}

	}
