import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.io.*;


                     
public class  DemoFile
{
	public static void main(String [] args) throws Exception
	{
		File infile = new File("Data.txt");
		if ( !infile.exists())
		{
			System.out.println("There is no File");
		    System.exit(0);
		}
		Scanner input = new Scanner(infile);
		File outfile = new File("out.txt");
		PrintWriter pr = new PrintWriter(outfile)
		;
		
		while(input.hasNext())
		{
			String line= input.nextLine();
			System.out.println(line);
			pr.println(line);
			
			
		}
		input.close();pr.close();
		
		
		System.exit(0);
	}
	
	
	
	
	
}