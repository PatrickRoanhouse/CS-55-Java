import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.io.*;


                     
public class APerson implements Driver
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







