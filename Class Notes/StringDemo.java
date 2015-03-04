// Name: Patrick Roanhouse

/*

CS 55 - Java Programming


*/


import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.io.*;
import java.awt.event.*;


public class StringDemo
{
	public static void main(String[] args) 
	{
		String x = JOptionPane.showInputDialog("Enter Phase");
		System.out.println(x);

		int n = x.indexOf(" ");
		System.out.println("=====>>> "+n);

		String first = x.substring(0,n);
		System.out.println(first);
		String rest = x.substring(n);
		System.out.println(rest);

		String f = rest + " " + first;
		System.out.println("++++>>> " + f);

		
	}
	
}


