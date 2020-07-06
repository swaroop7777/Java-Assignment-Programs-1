package allassignments;

import java.util.Scanner;

public class AdjacentRecCancel {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.next();
		l1:
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					if(s.length()==2)
					{
						s="";
					    break l1;
					}
						
					if(i==0)
					{
					s=s.substring(j+1);
				    i=-1;
				    continue l1;
					}
					else
					{
					s=s.substring(0, i)+s.substring(j+1);
					i=-1;
					continue l1;
					}
				}
			else
				continue l1;
		}

	}
		if(s.length()==0)
			System.out.println(0);
		System.out.println(s);
}
}
