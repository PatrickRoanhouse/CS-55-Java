// Name: Patrick Roanhouse

/*

CS 55 - Java Programming


*/


import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.io.*;
import java.awt.event.*;


public class ArrayDemo4
{
	public static void main(String [] args)
	{
	

		int a[] = new int[10];
		String out = "";

		for(int i = 0 ; i < a.length ; i++ )
		{
			a[i] = i + 1;
			out+= "a[" + i + "] = " + (i + 1) +"\n";


		}
		JOptionPane.showMessageDialog(null, out);
		//MyIO.display(out);





		String mess = greeting("Lisa") + " " + greeting("Jack");
		
		JOptionPane.showMessageDialog(null, mess);


		//greeting("Happy Norooz");

		//ArrayDemo x = new ArrayDemo();
		//x.greeting();
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


