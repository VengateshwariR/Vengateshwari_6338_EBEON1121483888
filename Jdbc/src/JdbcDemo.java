import java.sql.*;

public class JdbcDemo 
{

	public static void main(String[] args) 
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
		    Connection con =DriverManager.getConnection("jdbc:mysql:///demo","root","12345");
		    
		    
			Statement stmt = con.createStatement();
		    
		   // String query = "create table list(id int,name varchar(20))";
		    String query = "insert into list values(11,'ravi'),(12,'ram')";
		    int i=stmt.executeUpdate(query);
		    if(i>0)
		    {
		    	System.out.println("Record is inserted");
		    }
		}
		catch(Exception e)
		{
			System.out.println("Exception has occured"+e);
		}
		
		
	}                                                                                                                                                                                                                                                    

}

