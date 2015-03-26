// Name: Patrick Roanhouse

/*

CS 55 - Java Programming


*/


import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.io.*;
import java.awt.event.*;


public class PracticeRandom
{
	public static void main(String [] args)
	{
		
		int n1 = 0, n2 = 0, n3 = 0, n4 = 0, n5 = 0, n6 = 0;
		
		for(int i=0 ; i < 1000 ; i++)
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
		
		String out = "The die has been thrown 1000 times\n";
		
		out+=   "Occurences of 1's are: " + n1 + "\n" + "Occurences of 2's are: " + n2 + "\n" + "Occurences of 3's are: " + n3 + "\n" + "Occurences of 4's are: " + n4 + "\n" + "Occurences of 5's are: " + n5 + "\n" + "Occurences of 6's are: " + n6 + "\n";
		
		MyIO.display(out,Color.ORANGE,Color.BLUE,32);
					
		System.exit(0);
	}
	
}


