package allassignments;

import java.util.Scanner;

public class SecondOccurenceOfChar {

	public static void main(String[] args) {
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		char[] s = sc.next().toCharArray();

		System.out.println("Enter the charecter you want to find second occurrence for.. ");
		char[] ch = sc.next().toCharArray();
		for (int i = 0; i < s.length; i++) {
			if (s[i] == ch[0]) {
				count++;
			}
			if (count == 2 && s[i] == ch[0]) {
				System.out.println("Second occurence index of " + s[i] + " is:" + i);
				break;
			}
		}

	}

}
