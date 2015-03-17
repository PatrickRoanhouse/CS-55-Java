// Name: Patrick Roanhouse

/*

CS 55 - Java Programming


*/


import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.io.*;
import java.awt.event.*;


public class ShowStringBuffer
{
	public static void main(String args[])
	{
		StringBuffer sb = new StringBuffer("1234567890");
		System.out.println("========>> " + sb);
		
		sb.append("zzzzzzzzzzz");
		System.out.println("========>> " + sb);
		
		int cp = sb.capacity();
		
		System.out.println("========>> " + cp);
		System.out.println("========>> " + sb.length());
		System.out.println("== Formated: " + getFormat());
	
		System.exit(0);
	}
	
	public static String getFormat()
	{
		int a = 10;
		double b = 37.80;
		String st = "That is so Cool";
		return String.format("a = %d, b = %6.2f\n%s\n",a,b,st);
	}
}


