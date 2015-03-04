// Name: Patrick Roanhouse

/*

CS 55 - Java Programming


*/


import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.io.*;
import java.awt.event.*;


public class PracticeWithString2
{
	public static void main(String [] args)
	{
		String x = JOptionPane.showInputDialog ("Enter Phrase");
		System.out.println(x);
		
		char ch = x.charAt(0);
		String rest = x.substring(1); // x is emutable so you can't change it
		String result = rest + ch;
		System.out.println(result);
	
	
	}
	
}


