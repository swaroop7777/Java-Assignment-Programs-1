package allassignments;

import java.util.Scanner;

public class InsertStringToIndex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the main String:");
		String str = sc.next();
		System.out.println("Enter the substring to be inserted:");
		String s = sc.next();
		System.out.println("Enter the index at which you want to insert the above string:");
		int index = sc.nextInt();
		String temp = str.substring(index + 1);
		System.out.println("The Final String is:" + str.substring(0, index + 1) + s + temp);

	}

}
