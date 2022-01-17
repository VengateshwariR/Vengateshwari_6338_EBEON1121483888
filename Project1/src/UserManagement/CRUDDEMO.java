package UserManagement;
import java.util.*;

class BankAccount {
	private int actno;
	private String cname;
	private int actbal;
	 
	BankAccount(int actno, String cname, int actbal ){
	
		this.actno = actno;
		this.cname = cname;
		this.actbal = actbal;
	}

	public int getActno() {
		return actno;
	}

	public String getCname() {
		return cname;
	}

	public int getActbal() {
		return actbal;
	}
    public String toString(){
	return actno+""+cname+""+actbal;
    }
}
class CRUDDEMO{
	public static void main(String[] args) {
		
		List<BankAccount> c = new ArrayList<BankAccount>();
		Scanner s = new Scanner(System.in);
		Scanner s1 = new Scanner(System.in);
		int ch;
		do {
			System.out.println("      User Management System in Banking     ");
			System.out.println("-----------------------------------");
			System.out.println("-----------------------------------");
			System.out.println(" Press 1 for INSERT ");
			System.out.println(" Press 2 for DISPLAY ");
			System.out.println(" Press 3 for SEARCH ");
			System.out.println(" Press 4 for DELETE ");
			System.out.println(" Press 5 for UPDATE ");
			System.out.println(" Enter Your Choice :");
			ch = s.nextInt();
			
			
			switch(ch){
			    case 1:
			    	System.out.println("Enter actno : ");
			    	int cno = s.nextInt();
			    	System.out.println("Enter cname : ");
			    	String cname = s1.nextLine();
			    	System.out.println("Enter actbal : ");
			    	int cbal= s.nextInt();
			    	
			    	c.add(new BankAccount(cno,cname,cbal));
			    break;
			    case 2:
			    	System.out.println("---------------------------");
			    	Iterator<BankAccount> i = c.iterator();
			    	while(i.hasNext()) {
			    		BankAccount b = i.next();
			    		System.out.println(b);
			    	}
			    	System.out.println("---------------------------");
			    break;
			    case 3:
			    	boolean found = false;
			    	System.out.print("Enter cno to search :");
			     	int actno = s.nextInt();
			        System.out.println("---------------------------");
			        i = c.iterator();
			        while(i.hasNext()){
			        	BankAccount b = i.next();
			        	if(b.getActno() == actno) {
                           System.out.println(b);
                           found = true;
			    	   }
			        }
			        
			        if(!found){
			        	System.out.println("Record Not Found");
			        }
			    	System.out.println("---------------------------");
			    break;
			    case 4:
			        found = false;
			    	System.out.print("Enter cno to Delete :");
			     	actno = s.nextInt();
			        System.out.println("---------------------------");
			        i = c.iterator();
			        while(i.hasNext()){
			        	BankAccount b = i.next();
			        	if(b.getActno() == actno) {
                           i.remove();
                           found = true;
			    	   }
			        }
			        
			        if(!found){
			        	System.out.println("Record Not Found");
	                }else {
	                	System.out.println("Record is Deleted Successfully....!");
	                }
			    	System.out.println("---------------------------");
			    break;
			    case 5:
			        found = false;
			    	System.out.print("Enter cno to Update :");
			     	actno = s.nextInt();
			        System.out.println("---------------------------");
			        ListIterator<BankAccount>li = c.listIterator();
			        while(li.hasNext()){
			        	BankAccount b = li.next();
			        	if(b.getActno() == actno) {
                             System.out.println("Enter new Name : ");
                             cname = s1.nextLine();
                             
                             System.out.println("Enter new actbal :");
                             cbal = s.nextInt();
                             li.set(new BankAccount(actno,cname,cbal));
                             found = true;
			    	   }
			        }
			        
			        if(!found){
			        	System.out.println("Record Not Found");
	                }else {
	                	System.out.println("Record is Update Successfully....!");
	                }
			    	System.out.println("---------------------------");
			    break;
		    }
		}while(ch!=0);
	  }
		
	}

	
	
		
	

	
		
	


