package string;

import java.util.Scanner;

public class StringCompare
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first String");
		String s=sc.nextLine();
		System.out.println("Enter the second String");
		String s1=sc.nextLine();
		
		
		System.out.println("Comparing strings with compareTo:");
		System.out.println(s.compareTo(s1));
		
		
		
	}

}
