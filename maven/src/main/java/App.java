

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Answer;
import com.entity.Employee;
import com.entity.Project;
import com.entity.Question;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	try
    	{
        System.out.println( "Hello World!" );
        
        Configuration con=new Configuration();
        con.configure("hibernate.cfg.xml");
        
        System.out.println( "Hello World" );
        
        SessionFactory object=con.buildSessionFactory();
        Session session=object.openSession();
        
        Employee employee1=new Employee();
        employee1.setEmployeeId(1);
        employee1.setEmployeeName("Kavi");
        
        Employee employee2=new Employee();
        employee2.setEmployeeId(2);
        employee2.setEmployeeName("Susi");
        
        List<Employee> listEmployee=new ArrayList<Employee>();
        listEmployee.add(employee1);
        listEmployee.add(employee2);
        
        Project project1=new Project();
        project1.setProjectId(101);
        project1.setProjectName("Java");
        project1.setEmployee(listEmployee);
        
        Project project2=new Project();
        project2.setProjectId(102);
        project2.setProjectName("Angular");
        project2.setEmployee(listEmployee);
        
        Project project3=new Project();
        project3.setProjectId(103);
        project3.setProjectName("Maven");
        project3.setEmployee(listEmployee);
        
        List<Project> projectList=new ArrayList<Project>();
        
        projectList.add(project1);
        projectList.add(project2);
        projectList.add(project3);
        
        employee1.setProject(projectList);
        employee2.setProject(projectList);
        
        session.saveOrUpdate(employee1);
        session.saveOrUpdate(employee2);
        
        
       // EmployeeEntity obj1=new EmployeeEntity();
       // obj1.setEmployeeId(101);
        //obj1.setEmployeeNmae("kavi");
       // obj1.setEmployeeCity("Chennai");
        
       // Question obj=new Question();
        //obj.setId_q(100);
        //obj.setQuestion(" what is java ");
        
       // Answer obj1=new Answer();
        //obj1.setAnswer("Java is pure object oriented language");
        //obj1.setId_a(1);
        //obj1.setQuestion(obj);
        
        //Answer obj2=new Answer();
        //obj2.setAnswer("Java is powerful language");
        //obj2.setId_a(2);
        //obj2.setQuestion(obj);
        

       // List<Answer>list=new ArrayList<Answer>();
       // list.add(obj1);
        //list.add(obj2);
        
       // obj.setAnswer(list);
       
                
        
        //session.save(obj);
        //session.save(obj1);
        //session.save(obj2);

               
        Transaction trans=session.beginTransaction();
        //session.save(obj1);
        trans.commit();
        
    }
    catch(Exception e)
    {
    	System.out.println("Exception occured" +e);
    }
        
        
    }
}
