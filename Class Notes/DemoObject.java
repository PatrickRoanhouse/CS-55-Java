// Name: Patrick Roanhouse

/*

CS 55 - Java Programming


*/


import java.awt.*;
import java.util.*;
import java.io.*;
import java.awt.event.*;
import javax.swing.*;

public class DemoObject
{
	public static void main (String [] args)
	{
		MyRect r1=new MyRect(); // empty constructor 
		r1.setWidth(20);
		r1.setHeight(130);
		System.out.println("The area is " + r1.getArea());
		
		MyRect r2 = new MyRect(100,40);
		
		if( r1.getHeight() > r2.getHeight());
		{
			System.out.println("r1 > r2");
				
				System.out.println(r1 +"=======\n"+r2.toString());
		}
		System.exit(0);
	}
}

class MyRect
{
	private int width;
	private int height;
	
	public MyRect()
	{
		
	}
	public MyRect(int w, int h)
	{
		width = w;
		height = h;
	}
	public void setWidth(int width)
	{
		this.width = width;
	}	
	public int getWidth()
	{ 
		return width;
	}
	public void setHeight(int height)
	{
		this.height = height;
	}	
	public int getHeight()
	{ 
		return width;
	}
	public int getArea()
	{
		return width * height;
	}
	public String toString()
	{
		return "MyRect :" + "\n" + "Width : " + width + "\nHeight : " + height + "\n" + "Area : " + getArea() + "\n";
	}
}
