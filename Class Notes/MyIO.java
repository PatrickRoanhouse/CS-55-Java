// Name: Patrick Roanhouse

/*

CS 55 - Java Programming


*/


import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.io.*;
import java.awt.event.*;


public class MyIO
{
	public static int getInt(String s)
	{
		String strNum = "";
		int n=0;
		boolean ok = false;
		
		while(! ok)
		{
			try
			{
			String strNum = JOptionPane.showInputDialog(s);
			int n1 = Integer.parseInt(strNum);
			ok = true;
			}
			catch (Exception ex)
			{
				JOptionPane.ShowMessageDialog(null,strNum+"is not an interger try again");
			}
		}
		
		
		
		return n1;

	}
	public static void display(String ss)
	{
		JOptionPane.showMessageDialog(null,ss);
	}

	public static void display(String ss, Color bg, Color fg, int size)
	{

		JTextArea jt = new JTextArea(20,25);
		jt.setBackground(bg);
		jt.setForeground(fg);
		jt.setText(ss);
		JOptionPane.showMessageDialog(null,jt);

	}
	
}


