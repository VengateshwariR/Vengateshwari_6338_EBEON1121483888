package string;

import java.util.Scanner;

public class Palindrome 
{
	public static void main(String[]args)
	{
		Scanner sc1=new Scanner(System.in);
		System.out.println("enter the String");
		 String word=sc1.nextLine();
		 String word1="";
		for(int i=word.length()-1;i>=0;i--)
		{
	      word1=word1+word.charAt(i);
		}
		if(word.equals(word1))
		{
			System.out.println("String is palindrome");
		}
		else
		{
			System.out.println("String is not palindrome");
		}
		
		}
}		
		
		
		

