import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.io.*;


                     
public class TestAPerson
{
	
	public static void main(String[] args)
	{
		Student st= new Student("Susan","Baker","333-33-333",22,
		"Baker_Susan@SMC.edu",3.8,"6666");
		
		/*
		st.setFirstName("Susan");
		st.setLastName("Baker");
		st.setAge(22);
		st.setGPA(3.8);
		st.setID("66666");
		*/
		System.out.println(st.toString());
		
		APerson p6= st;
		if( p6 instanceof Student)
		   System.out.println("====gpa>>"+((Student)p6).getGPA());
		
		
		APerson p1 = new APerson("Lisa","Smith",
		"111-11-1111",21,null);
		System.out.println("APerson gets:"+
		PayRoll.computeSal(p1)+"\n"
		+"Students gets:"+PayRoll.computeSal(st)+"\n");
		
		
		
		
		APerson p2 = new APerson("Jack","Smith",
		"222-22-1111",40,null);
		
		p2.marriedTo(p1);
		System.out.println(p2);
		
		
		
		
		APerson p3 = new APerson("XJack","XSmith",
		"222-22-1111",40,null);
        p3.marriedTo(p1);
		
		boolean x=p1.divorceFrom(p2);
		if(x)
		{
		 
		 System.out.println(" they are divorced");	
			
		}
		p3.marriedTo(p1);
		System.out.println(p3.toString());
		
		p2.marriedTo(st);
		System.out.println(st);
		
		x=p3.divorceFrom(st);
		if(!x)
		{
		 
		 System.out.println("They are not marrrrired to each other");	
			
		}
		
	}
	
	
	
}

class APerson implements Driver, EMP
{
	private String firstName;
	private String lastName;
	private String sSN;
	private int age;
	private String email;
	private APerson hw;
	
	public APerson()
	{
		
	}
	public APerson(String fn,String ln,
	String s,int a,String e)
	{
	  this.firstName=fn;
	  this.lastName=ln;
	  this.sSN=s;
	  this.setAge(a);this.email=e;
		
	}
	public APerson(String fn,String ln,
	String s)
	{
		this(fn,ln,s,0,"");
	 /* this.firstName=fn;
	  this.lastName=ln;
	  this.sSN=s;*/
	}
	public void setFirstName(String fn)
	{
		this.firstName=fn;
		
	}
	public String getFirstName()
	{
		return this.firstName;
	}
	
	public void setLastName(String fn)
	{
		this.lastName=fn;
		
	}
	public String getLastName()
	{
		return this.lastName;
	}
	public void setSSN(String s)
	{
		this.sSN=s;
		
	}
	public String getSSN()
	{
		return this.sSN;
	}
	public void setEmail(String email)
	{
		this.email=email;
		
	}
	public String getEmail()
	{
		return this.email;
	}
	
	
	
	
	public void setAge(int a)
	{
		if (a > 0)
			this.age=a;
		else
			System.out.println("age can not be negative");
	}
	public int getAge()
	{
		return age;
	}
	public boolean isMarried()
	{
	   return hw != null;	
		
	}
	public boolean divorceFrom(APerson p)
	{
		if( hw==p && p.hw==this)
		{
			p.hw=null;
			hw=null;
			return true;
		}
		else
		{
		System.out.println("They are not married to each other or not married");
		return false;
		}
		
	}
	public double getSal()
	{
		return 60000;
		
	}
	
	
	public void marriedTo(APerson p)
	{
		if( this.isMarried() || p.isMarried())
		   System.out.println("Opps  you are already Married");
	    else
		{
			p.hw = this;
			this.hw=p;
		}
		
		
	}
	
	public String howToDrive()
	{
		if(isMarried())
			return "Drives Safely....\n";
		else
			return "Drives Recklessly...\n";
		
	}
	
	public String toString()
	{
		 return "First Name:"+firstName+"\n"
		       +"Last Name:" +lastName+"\n"
			   +"Social Security:"+sSN+"\n"
			   +"Age:"+ age+ "\n"
			   +"Email:"+((lastName!=null)?
			   lastName+"_"+firstName+"@SMC.edu":email)
			   +"\n"+
			   "Driving Status :"+howToDrive()+"\n"
			   +"Spause:"+((isMarried()? hw.getFirstName() : "I am Availabel..."))+
			   "\n";
		
		
		
	}
	
	
	
	
	
	
}

interface Driver
{
  public String howToDrive();	
}
interface EMP
{
	public double getSal();
	
}

class Student extends APerson
{
	 private String iD;
	 private double gpa;
  public Student()
  {
	  super();
  }  
  public Student(String fn,String ln,String s,
  int a,String e,double g,String id)
  {
	super(fn,ln,s,a,e);
    iD=id; gpa=g;	
	  
  }
  
  public double getSal()
  {
	  return 10000;
  }
  
  
  
  public void setID(String id)
  {
	  iD = id;
  }
  public String getID()
  {
	  return iD;
  }
  
  
  public void setGPA(double g)
  {
	  gpa=g;
  }
  public double getGPA()
  {
	  return gpa;
	  
  }
  
  public String toString()
  {
	  return super.toString()+
	        "GPA:"+gpa+"\n"
			+"ID:"+iD+"\n";
	  
	  
  }
  
  
  
  
	
}

class PayRoll
{
	public static double computeSal(EMP e)
	{
		
		return e.getSal();
		
	}
}






