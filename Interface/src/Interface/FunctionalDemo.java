package Interface;

import java.util.function.Consumer;

public class FunctionalDemo
{
	public static void main(String args[])
	{
		Consumer<String>c1 = s-> System.out.println(s);
		//c1.accept("Funtional Interface");
		Consumer<String>c2 = s-> System.out.println(s.toUpperCase());
		//c2.accept("Funtional Interface");
		
	    c1.andThen(c2).accept("Functional Interface");

    }

}
