import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.io.*;

public class PracticeWithBoolean
{
  public static void main(String [] args)
  {
    Scanner input= new Scanner(System.in);
	Scanner input2= new Scanner(System.in);
    System.out.println("Is 8 > 5 true\\false");
    boolean ans=input.nextBoolean();
	
	if(ans)
	System.out.println(" That is Correct");
	else
	System.out.println("No Correct");
	//input.nextLine();
	String name=input2.nextLine();
	System.out.println("====>>"+name);
	
	double sumN=0.0; double sumP=0.0;
	double num=0.0;int cP=0,cN=0;
	System.out.print("Enter number:");
	while(input.hasNext())
	{
	  num=input.nextDouble();
	  if(num > 0)
	   {
	   sumP+=num;
	   cP++;
	   }
	   else
	   {
	    sumN+=num;
		cN++;
		}
	
	
	
	}
	System.out.println("Total Pos is:"+sumP);
	System.out.println("Avg Pos is:"+sumP/cP);
	
	System.out.println("Total Neg is:"+sumP);
	System.out.println("Avg Neg is:"+sumN/cN);
	
	}
	
	
  
  
  



}