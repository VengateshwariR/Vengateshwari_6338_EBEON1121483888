package string;

import java.util.Scanner;

public class Removingduplicates
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first String");
		String s=sc.nextLine();
		System.out.println("new String : "+removeDuplicateschar(s));
	}
	public static String removeDuplicateschar(String s) {
		String newStr="";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(newStr.indexOf(ch)==-1)
			{
				newStr+=ch;
			}
			}
			
		return newStr;
		
		}
	}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
	
	


