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
		// String Memory Memory
		String s1 = new String("Lisa"); // Memory ad100
		
		String s2 = "Lisa"; // Memory ad200 Same Address because it sees s2 == s3 
		
		String s3 = "Lisa"; // Memory ad200 Same Address because it sees s3 == s2
		
		String s4 = new String("Lisa"); // Memory ad300
		
		
		// True / False 
		boolean x= s2==s3; //True
		boolean y= s1==s4; // False
		boolean z= s1.equals(s4); //True
		boolean t= s2.equals(s3); //True
		
		
		// Prints out True / False for the Variables
		System.out.print("x = "+x+"\n");
		System.out.print("y = "+y+"\n");
		System.out.print("z = "+z+"\n");
		System.out.print("t = "+t+"\n\n");
		String out = "x = "+x+"\n"+"y = "+y+"\n"+"z = "+z+"\n"+"t = "+t+"\n\n";
		
		
		// prints dialog window with true / false
		System.out.println(out);
		JOptionPane.showMessageDialog(null,out);
		
		
		
		String str = JOptionPane.showInputDialog("Enter A Phrase");
		
		System.out.println(str.toLowerCase() + "\nhas " + str.length()+ " characters\n");
	
		char ch = str.charAt(0);
		
		System.out.println("The first character is : " + ch);
		
		for(int i=str.length()-1; i >=0 ; i--)
		{
			System.out.print(str.charAt(i));
			
		}
		System.out.println("\n");
	}
	
	
}


