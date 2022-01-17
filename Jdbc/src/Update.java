import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import java.sql.Statement;

public class Update{

	public static void main(String[] args)
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
		    Connection con =DriverManager.getConnection("jdbc:mysql:///rnm","root","12345");
		    Statement stmt = con.createStatement();
		   // String query = "create table student(id int,username varchar(20),mailid varchar(20))";
		    //String query = "insert into student values(1,'ravi','ravi@gmail'),(2,'ram','ram@gmail'),(3,'ragu','ragu@gmail')";
		   // String query= "insert into student(id,name,mailid) values(?,?,?)";
			//PreparedStatement pstmt= con.prepareStatement(query);
			//pstmt.setInt(1, 4);
			//pstmt.setString(2, "roy");		            
			//pstmt.setString(3, "roy@gmail");
			String query = "delete into student table where id=?";
		    
		    PreparedStatement pstmt1= con.prepareStatement(query);
			pstmt1.setInt(1, 2);

		    int i=stmt.executeUpdate(query);
			
			if(i>0)
			{
				System.out.println("inserted successfully");
			}
		}
		catch (Exception e)
			{
				System.out.println("Eception has occured"+e);
			}
				
	}	
		
}	
			
	

	


