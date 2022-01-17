package string;

import java.util.StringJoiner;

public class StringJoinerDemo
{
	public static void main(String[]args)
	{
	   StringJoiner sj1= new StringJoiner(":","#","#");
	
	   
	   sj1.add("Kavi");
	   sj1.add("Susi");
	   sj1.add("Shalini");
	   sj1.add("Yoga");

	   
	   System.out.println(sj1);
	   
	   
	   StringJoiner sj2= new StringJoiner(":","[","]");
	   sj2.add("Apple");
	   sj2.add("Grape");
	   sj2.add("Banana");
	   sj2.add("Mango");
	   
	   System.out.println(sj2);
	   
	   System.out.println("Merge   "+sj1.merge(sj2));
	   
	   
	}

	
}
