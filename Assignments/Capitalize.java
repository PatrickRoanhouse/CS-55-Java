// Name: Patrick Roanhouse

/*

CS 55 - Java Programming


*/


import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.io.*;
import java.awt.event.*;


public class Capitalize
{
	public static void main(String [] arg)
	{

		String x = JOptionPane.showInputDialog("Enter Phase");

		String y = capsFirst(x);

		System.out.println(y);
	}


	public static String capsFirst(String str) 
	{
		boolean betweenWords = false;
		char[] chars = str.toCharArray();

		for(int i = 0; i < chars.length; i++) 
		{
			if (chars[i] == ' ')
			{
				betweenWords = true;
		        continue;
			}
			if (betweenWords || i == 0)
			{
				if (Character.isLetter(chars[i]))
				{
					chars[i] = Character.toUpperCase(chars[i]);
				}
		    	betweenWords = false;
			}
		}
		return new String(chars);
	}
}