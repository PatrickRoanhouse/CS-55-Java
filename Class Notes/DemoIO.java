// Name: Patrick Roanhouse

/*

CS 55 - Java Programming


*/


import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.io.*;
import java.awt.event.*;


public class DemoIO
{
	public static void main(String args[])
	{
		Scanner input= new Scanner(System.in);
		
		System.out.print("What is your name? ");
		String name=input.next();
		
		System.out.println(name + " hope you are well!");
		System.out.printf("%s Wish you Well \n", name);
		
		System.exit(0);	
			
	}
	
}


