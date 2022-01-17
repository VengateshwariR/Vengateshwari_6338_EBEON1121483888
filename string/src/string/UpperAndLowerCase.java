package string;

import java.util.Scanner;

public class UpperAndLowerCase
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first String");
		String s =sc.nextLine();
		System.out.println("convert the string into upper case");
		System.out.println(s.toUpperCase());
		System.out.println("convert the string into lower case");
		System.out.println(s.toLowerCase());
	}

}
