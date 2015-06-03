// Name: Patrick Roanhouse

/*

CS 55 - Java Programming


*/


import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.io.*;
import java.awt.event.*;
import java.util.Scanner;


public class Insurance
{
	public static double calculation(int n)
	{
		double res = 1000.00;
	    
		if (n >= 16 && n <= 19)
		{
			return (15*res)/100+res;
		}
	    else if (n >= 20 && n <= 25)
	   	{
			return (5*res)/100+res;
	    }
		else if (n > 25)
		{
			return (10*res)/100+res;
		}
		return res;
	}
	
	public static void main(String[] args) throws IOException
	{
		FileReader source = new FileReader("data.txt");
		BufferedReader filereader = new BufferedReader(source);
		String textstring = filereader.readLine();
		while (textstring != null)
		{
			String[] l = textstring.split(" ");
			String name = "";
			for (int i = 0; i < l.length-1; i++)
			{
				name += l[i] + " ";
			}
			if(Integer.parseInt(l[l.length-1]) >= 16)
			{
				System.out.println("The cost of automobile insurance premium for "+name+"is $"+calculation(Integer.parseInt(l[l.length-1])));
			}
			else
			{
				System.out.println("Sorry, "+name+ "is " + Integer.parseInt(l[l.length-1])+" years old, we can't insurance them.");
			}
			textstring = filereader.readLine();
		}
	}
}