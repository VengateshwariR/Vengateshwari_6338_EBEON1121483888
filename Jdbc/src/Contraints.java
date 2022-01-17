import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Contraints 
{

	public static void main(String[] args)
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql:///demodb","root","12345");
			// Connection con =DriverManager.getConnection("jdbc:mysql:///demo","root","12345");
			Statement stmt=con.createStatement();
			
		    //String query="create table emp(id int,name varchar(20),age int)";
		    String query = "insert into data values(1,'ravi',30),(2,'ram',32),(3,'ragu',27)";
		    int i=stmt.executeUpdate(query);

		    
		    if(i>0)
		    {
		    	System.out.println("Record is inserted");
		    }
		}
		catch(Exception e)
		{
			System.out.println("Exception has occurred"+e);
			
		}
	}
}

