// Name: Patrick Roanhouse

/*

CS 55 - Java Programming


*/


import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.io.*;
import java.awt.event.*;


public class ArrayDemo5
{
	public static void main(String [] args)
	{
		double [] d = {2.7, 7.8, 9.8, 4.0};
		String [] arst ={"Lisa","Jack","Mary","Joe","Susan"};

		String [] st = { new String("888"), new String("999"), new String("777"), new String("666")};

		int loc = findName(arst,"Lisa");
		
		if ( loc >= 0)
		{
			System.out.println("Lisa Is At Location " + loc);
		}
		else
		{
			System.out.println("No Lisa in Board");
		}
	
/*
		int a[] = new int[10];
		String out = "";

		for(int i = 0 ; i < a.length ; i++ )
		{
			a[i] = i + 1;
			out+= "a[" + i + "] = " + (i + 1) +"\n";


		}
		JOptionPane.showMessageDialog(null, out);
		MyIO.display(out);





		String mess = greeting("Lisa") + " " + greeting("Jack");
		
		JOptionPane.showMessageDialog(null, mess);


		//greeting("Happy Norooz");

		//ArrayDemo x = new ArrayDemo();
		//x.greeting();

	*/	
	}

	public static int findName(String [] x, String key)
	{
		for(int i = 0; i < x.length; i++)
		{
			if(x[i].equals(key))
			{
				return i;
			}
		
		
		}
		return -1;
	}
	
	public static String greeting(String x)
	{
		JOptionPane.showMessageDialog(null, x);
	
		if(x.equalsIgnoreCase("Lisa"))
		{
			return x + " please call me. ";
		}
		else
		{
		 return x + " don't you ever call me! ";
		}
	}
	
}


