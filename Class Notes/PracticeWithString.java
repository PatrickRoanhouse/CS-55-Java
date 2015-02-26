// Name: Patrick Roanhouse

/*

CS 55 - Java Programming


*/


import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.io.*;
import java.awt.event.*;


public class PracticeWithString
{
	public static void main (String [] args)
	{
		String str = JOptionPane.showInputDialog("Enter A Phrase");
		System.out.println(str.toLowerCase + "\n has " + str.length()+ " Characters\n");
	
		char ch = str.charAt(0);
		
		System.out.println("The first character is : " + ch);
		
		for(int i=str.length()-1; i >=0 ; i--)
		{
			System.out.print(str.charAt(i));
			
		}
		System.out.println("\n");
	}
	
	
}


