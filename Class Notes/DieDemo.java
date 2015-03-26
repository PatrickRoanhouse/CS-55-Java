// Name: Patrick Roanhouse

/*

CS 55 - Java Programming


*/


import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.io.*;
import java.awt.event.*;


public class  DieDemo
{
	public static void main (String [] args)
	{
		Die d1 = new Die ("Red");
		d1.throwDie(2000);
		
		Die d2 = new Die ("Blue");
		d2.throwDie(3000);
		
		Die d3 = new Die ("Green");
		d3.throwDie(4000);

		
		String out = d1.getInfo() + d2.getInfo() + d3.getInfo();
		
		MyIO.display(out,Color.BLACK,Color.YELLOW,30);
	}
	
}


