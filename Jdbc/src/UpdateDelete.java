import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateDelete 
{
	public void update() throws SQLException {
		 Connection con =DriverManager.getConnection("jdbc:mysql:///update","root","12345");
		// String query = "create table student(id int,Question varchar(20),Answer varchar(20))";
		 String query = "insert into student values(11,'ravi','ravi@gmail'),(12,'ram','ram@gmail')";
		//Connection con= getConnection();
		try {
		Statement st = con.createStatement();
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);

		ResultSet rs = st.executeQuery("select * from student");
		 //String query = "create table student(id int,Question varchar(20),Answer varchar(20))";
		
		System.out.println("Enter Id Do you want to Update:");
		int id = sc.nextInt();
		System.out.println("Here update your name:");
		String name = sc1.nextLine();

		System.out.println("Here update your mailid");
		String mailid = sc1.nextLine();
		String sql = ("update student set name =?,mailid=? where id=? ");  
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setString(1, name);
		pst.setString(2, mailid);		            
		pst.setInt(3, id);
		pst.executeUpdate(query);
		System.out.println(" Your name and mailid are Updated successfully");
		}

		catch (SQLException e) {
		System.out.println(e);
		}
		}

		//public void delete() throws SQLException {
		//Connection con = getConnection();
		//Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kavinila", "root", "Kavi@967761");
		//Statement st = con.createStatement();
		//Scanner sc = new Scanner(System.in);

		//ResultSet rs = st.executeQuery("Select * from Chatbot26");

		//System.out.println("Your content is");
		//while (rs.next()) {
		//System.out.println("\n" + "Id :" + rs.getString(1) + "\t" + "Question" + ": " + rs.getString(2) + "\t"
		//+ "answer:" + rs.getString(3));
		//}
		//System.out.println("");
		//System.out.println("Enter Id Do you want to delete:");
		//int id = sc.nextInt();

		//String sql = ("DELETE FROM Chatbot26 where id=? ");
		//PreparedStatement pst = con.prepareStatement(sql);
		//pst.setInt(1, id);
		//pst.executeUpdate();
		//System.out.println("Deleted sucessfully");
		//}

		public static void main(String[] args) throws SQLException {
		UpdateDelete a = new UpdateDelete();
		//a.add();
		a.update();
		//a.delete();
		}
		}



