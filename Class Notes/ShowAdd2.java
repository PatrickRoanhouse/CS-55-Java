// Name: Patrick Roanhouse

/*

CS 55 - Java Programming


*/


import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.io.*;
import java.awt.event.*;


public class ShowAdd2
{
	
	public static void main(String args[])
	{
		int n1 = MyIO.getInt("Enter Number 1");
		int n2 = MyIO.getInt("Enter Number 2");

		MyIO.display("total is " + (n1+n2));
		MyIO.display("total is "+ (n1+n2), Color.BLACK, Color.WHITE,23);

		/* 
		String strNum=JOptionPane.showInputDialog("Enter a Number 1");

		int n1= Integer.parseInt(strNum);

		String strNum2=JOptionPane.showInputDialog("Enter a Number 2");

		int n2= Integer.parseInt(strNum2);

		JOptionPane.showMessageDialog(null,"Total is " + (n1 + n2));
		*/
	}

}


