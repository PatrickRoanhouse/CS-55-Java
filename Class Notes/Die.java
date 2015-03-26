// Name: Patrick Roanhouse

/*

CS 55 - Java Programming


*/


import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.io.*;
import java.awt.event.*;


public class Die
{
	
	private String color;
	private int n1,n2,n3,n4,n5,n6;
	private int nTimes;
	
	public Die(String c)
	{
		color = c;
	}
	
	public void throwDie(int nt)
	{
		
		int nTimes = nt;
		for(int i=0 ; i < nt ; i++)
		{
			int dice = (int)(Math.random()*6)+1;
			switch( dice )
			{
				case 1 : n1++; break;
				case 2 : n2++; break;
				case 3 : n3++; break;
				case 4 : n4++; break;
				case 5 : n5++; break;
				case 6 : n6++; break;
				default : ;
			}
		}
	}	
		public String getInfo()
		{
			String out = "The" + color + " die has been thrown " + nTimes + " times\n";
		
			out+=   "Occurences of 1's are: " + n1 + "\n" + 
					"Occurences of 2's are: " + n2 + "\n" + 
					"Occurences of 3's are: " + n3 + "\n" + 
					"Occurences of 4's are: " + n4 + "\n" + 
					"Occurences of 5's are: " + n5 + "\n" + 
					"Occurences of 6's are: " + n6 + "\n";
			
			return out;
	
		}
	
}


