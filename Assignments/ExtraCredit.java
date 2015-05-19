// Name: Patrick Roanhouse

/*

CS 55 - Java Programming


*/


import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.io.*;
import java.awt.event.*;
import java.util.Date;
import java.math.BigInteger;


public class ExtraCredit {
	
	public static void main (String[] args)
	{
	
		Scanner sc = new Scanner(System.in);

		System.out.printf("\nEnter Number 1:\n");
		BigInteger bi1 = sc.nextBigInteger();
		System.out.printf("\nEnter Number 2:\n");
		BigInteger bi2 = sc.nextBigInteger();

		BigInteger bigSum = bi1.add(bi2);
	
		System.out.println("\nSum:\n" + bigSum);
	}
}