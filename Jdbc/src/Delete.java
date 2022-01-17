import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class Delete {

	public static void main(String[] args) {
		try
		{
	            Class.forName("com.mysql.cj.jdbc.Driver");
			    Connection con =DriverManager.getConnection("jdbc:mysql:///demo1","root","12345");
			    
			    
				//Statement stmt = con.createStatement();
			    
			    String query = "delete into student table where id=?";
			    
			    PreparedStatement pstmt1= con.prepareStatement(query);
				pstmt1.setInt(1, 1001);
				
				
			    int i=pstmt1.executeUpdate();
			    if(i>0)
			    {
			    	System.out.println("Record is deleted");
			    }
			}
			catch(Exception e)
			{
				System.out.println("Exception occur"+e);
			}
			
			
	}
}

	

	    
	   
	


