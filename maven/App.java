package project.maven;

import org.hibernate.Session;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Configuration con=new Configuration();
        con.configure("hibernate.cfg.xml");
        
        System.out.println( "Hello World" );
        
        SessionFactory object=con.buildSessionFactory();
        Session session=object.openSession();
        EmployeeEntity obj1=new EmployeeEntity();
        obj1.setEmployeeid(101);
        obj1.setEmployeeName("kavi");
        obj1.setEmployeeCity("Chennai");
        Transaction trans=session.beginTransaction();
        session.save(obj1);
        trans.commit();
        
        
        
        
    }
}
