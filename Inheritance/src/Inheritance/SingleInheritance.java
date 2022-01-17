
package Inheritance;
class test1
{
	int math,eng,computer;
	public void input()
	{
		math=55;
		eng=77;
		computer=44;
	}
	
	public void output()
	{
		System.out.println("----------Semester - 1-----------");
		System.out.println("Marks in Mathematics   "+math);
		System.out.println("Marks in English    "+eng);
		System.out.println("Marks in Computer   "+computer);
		int total_marks = math+eng+computer;
		
		System.out.println("Total marks in semester 1 -" +total_marks);
		
		
				
				
	}
}
class test2 extends test1
{
	int c,cpp,java;
	public void input2()
	{
		c=45;
		cpp=55;
		java=52;
	}
	
	public void output2()
	{
		System.out.println("----------Semester - 2-----------");
		System.out.println("Marks in c   "+c);
		System.out.println("Marks in cpp    "+cpp);
		System.out.println("Marks in java   "+java);
        int total_marks = c+cpp+java;
		
		
		System.out.println("Total marks in semester 2 -" +total_marks);
				
				
	}
}
public class SingleInheritance
{
	public static void main(String[]args)
	{
	Sem2 obj = new Sem2();
	obj.input();
	obj.input2();
	obj.output();
	obj.output2();
	}
}	
	
	
	
	


