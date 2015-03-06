// Name: Patrick Roanhouse

/*

CS 55 - Java Programming


*/


import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.io.*;
import java.awt.event.*;


public class ShowAdd
{
	
	public static void main(String args[])
	{
		String strNum=JOptionPane.showInputDialog("Enter a Number 1");

		int n1= Integer.parseInt(strNum);

		String strNum2=JOptionPane.showInputDialog("Enter a Number 2");

		int n2= Integer.parseInt(strNum2);

		JOptionPane.showMessageDialog(null,"Total is " + (n1 + n2));
	}

}


