package Inheritance;

class  Sem1
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
class  Sem2 extends Sem1
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
class  Sem3 extends Sem2
{
	int os,dbms,oops;
	public void input3()
	{
		os=57;
		dbms=84;
		oops =43;
	}
	
	public void output3()
	{
		System.out.println("----------Semester - 3-----------");
		System.out.println("Marks in os        "+os );
		System.out.println("Marks in dbms    "+dbms);
		System.out.println("Marks in oops   "+oops);
		int total_marks = os+dbms+oops;
		
		System.out.println("Total marks in semester 3 -" +total_marks);
		
		}
}
public class MultilevelInheritance
{
	public static void main(String[]args)
	{
	Sem3 obj = new Sem3();
	
	obj.input();
	obj.input2();
	obj.input3();
	obj.output();
	obj.output2();
	obj.output3();
	}
}	
	
	
	
	

