// Name: Patrick Roanhouse

/*

CS 55 - Java Programming


*/


import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.io.*;
import java.awt.event.*;


public class MethodDemo
{
	
	public static void main (String args[])
	{
		greeting();

		String x = getGreeting() + " " + getGreeting2();
		display(x);
		
		String y = getGreeting2();
		display(y);

		display("Listen to Me", 4);
	}

	public static void greeting()
	{
		JOptionPane.showMessageDialog(null,"Hello baby");
	}

	public static String getGreeting()
	{
		return "Happy New Year";
	}

	public static String getGreeting2()
	{
		return "Happy holiday";
	}

	public static void display(String mess)
	{
		JOptionPane.showMessageDialog(null,mess);
	}
	
	public static void display(String mess, int n)
	{
		String out = "";
		for(int i = 0 ; i < n ; i++)
		{
			out+= mess + "\n";
		}
		display(out);

	}
}




