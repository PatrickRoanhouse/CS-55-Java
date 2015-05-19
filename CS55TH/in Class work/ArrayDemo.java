import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.io.*;

public class ArrayDemo
{
  public static void main(String [] args)
  {   String xout="";
      for(int i=0; i < 8 ; i++)
	     xout+= getMessageOfDay();
	MyIO.display( xout   );
  
  
     double [] d={2.7,7.8,9.8,4.0};
     String [] arst={"Jack","Marry","Lisa","Joe","Susan"};
	 
	 String [] st={ new String("888"),
	                new String("999"),
					new String("777"),
					new String("666")};
	int loc   =findName(arst,"Lisa");
	if( loc >=0)
	System.out.println(" Lisa is at location "+(loc +1));				
	else				
	System.out.println("No Lisa in board");				
					
  /*
    int a[] = new int[10];
	String out="";
	for(int i=0 ; i < a.length ; i++)
	{
	   a[i]=i +1;
	   out+="a["+i+"]="+(i+1)+"\n";
	
	}
    MyIO.display(out);
  
  
  
  
  
  
 String mess  =greeting( greeting("Lisa") + "\n "+greeting("Jack"));
  // greeting("Happy Norooz");
   JOptionPane.showMessageDialog(null,mess);
   
//  ArrayDemo x= new ArrayDemo();
//  x.greeting();

*/
  }
  
  public static int findName(String [] x, String key)
  {
    for(int i=0; i < x.length; i++)
	    if(x[i].equals(key))
		   return i;

    return -1;  
  
  }
  public static String getMessageOfDay()
  {
     String [] x={"Get married Soon\n",
	              "Get divorce soon\n",
				  "Get your Ph.D as soon as you can\n",
				  "Do study for real\n",
				  "Buy a lottery today\n",
				  "Call you Mom today\n",
				  "Get F in all classes\n"
				  ,"Get the Life\n"};
				  
     int a =(int)(Math.random()*x.length);
  
     return x[a];
  }
  public static String greeting(String x)
  {
    JOptionPane.showMessageDialog(null,x);
	if(x.equalsIgnoreCase("Lisa"))
	return x + " Please call me";
	else
	return x + " Dont you ever call me";
	
  
  }


}