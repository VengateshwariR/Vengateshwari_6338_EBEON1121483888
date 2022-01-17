package string;

public class Maximumcharacter
{
	public static void main(String[]args)
	{
		String s="welcome to edubridge";
		int[]arr=new int[127];
		for(int i=0; i<s.length(); i++)
		{
			arr[s.charAt(i)]=arr[s.charAt(i)]+i;
			
		}
		int max=-1;
		char c=' ';
		
		for(int i=0; i<s.length(); i++)
		{
			if(max<arr[s.charAt(i)])
			{
				max=arr[s.charAt(i)];
				c=s.charAt(i);
			}
		}
		
		System.out.println("maximum repeated character is "+c);
	}

}
