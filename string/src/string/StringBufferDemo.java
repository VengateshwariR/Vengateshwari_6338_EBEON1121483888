package string;

public class StringBufferDemo
{
	public static void main(String[]args)
	{
		StringBuffer sb=new StringBuffer("Object Programing language");
			System.out.println("Length of" + sb +" is "+sb.length());
			
			for (int i=0; i<sb.length(); i++)
			{
				System.out.println("Character at"+i+" position is"+sb.charAt(i));
			}
			int pos=sb.indexOf("programming");
			System.out.println("Position is "+pos);
			
			sb.insert(pos, "Oriented");
			System.out.println("After inserting"+sb);
			pos=sb.indexOf("programming");
			sb.insert(pos,'-');
			System.out.println("After insert -"+sb);
			String str=sb.toString();
			System.out.println(str.concat("Hello"));
			sb.append("-----------");
			System.out.println("After insert -"+sb);
	}

}
