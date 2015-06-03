import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.io.*;


                     
public class  ComputeGrade
{
	public static void main(String [] args)
	throws Exception
	{
		File infile= new 
		File("C:\\Users\\dehkhoda_abbas\\Desktop\\temp\\stData.txt");
		
        Scanner input = new Scanner(infile);
		File outfile = new File("C:\\Users\\dehkhoda_abbas\\Desktop\\temp\\stGrade.txt");
        PrintWriter pr= new PrintWriter(outfile);
		
		pr.println(" List of Student Grade \n");
		
		while(input.hasNext())
		{
			String name = input.next();
			char g = (input.next()).charAt(0);
			double t1= input.nextDouble();
			double t2= input.nextDouble();
			double t3= input.nextDouble();
	pr.println(name+ " your grade is:" + getGrade(t1+t2+t3));
			
			
		}
		input.close(); pr.close();
		
	}
	public static char getGrade(double t)
	{
		double ave= t /3.0;char g=' ';
		switch ((int)ave/10)
		{
			case 10 : case 9 : g='A'; break;
			case 8 : g='B'; break;
			case 7 : g='C'; break;
			case 6 : g='D'; break;
			default : g= 'F';
			
		}
		return g;
	}
		
		
		
		
		
		
		
	}
		
		
		

