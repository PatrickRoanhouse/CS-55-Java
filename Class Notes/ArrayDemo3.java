// Name: Patrick Roanhouse

/*

CS 55 - Java Programming


*/


import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.io.*;
import java.awt.event.*;


public class ArrayDemo3
{
	public static void main(String [] args)
	{
		






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


