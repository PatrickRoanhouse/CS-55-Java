import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.io.*;

public class PracticeMethod
{
 public static void main(String [] args)
  {
    greeting("Good Night");
    greeting("Good Noon");
	String x="";
	x= greeting("Good Morning") + greeting("\nGood Noon");
	System.out.println("Ave is "+ ave(23.89,78.60,20));
	System.out.println(strAverage(45.90,67.90,78.56));
	
	System.out.println(x);
  }
   public static String strAverage(double x,double y,double z)
   {
   return  String.format("\naverage of %f, %f, and %f\nis %f\n",x,y,x,(x+y+z)/3);
      
   
   }
  
  
  
    public static double ave(double x,double y,double z)
	{
	  return (x + y + z)/3;
	
	}
  
  
  
  public static String greeting(String x)
  {
    System.out.println(x);
	JOptionPane.showMessageDialog(null,
	x,"Greeting",JOptionPane.QUESTION_MESSAGE);
    return x;
  }
  
  
 }