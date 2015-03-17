// Name: Patrick Roanhouse

/*

CS 55 - Java Programming


*/


import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.io.*;
import java.awt.event.*;


public class PracticeWithBoolean
{
	
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Is 8 > 5? (True\\False): ");
		boolean ans = input.nextBoolean();
		
		if(ans)
		{
			System.out.println("That is Correct");
		}
		else
		{
			System.out.println("Not Correct!");
		}
		
		input.nextLine();
		String name = input.nextLine();
		System.out.println("====>> " + name);
		
		double sumNeg = 0.0; 
		double sumPos = 0.0;
		double num = 0.0;
		int cPos = 0;
		int cNeg = 0;
		System.out.print("Enter Number: ");
		while(input.hasNext())
		{
			num = input.nextDouble();
			if(num > 0)
			{
				sumPos += num;
				cPos++;
			}
			else
			{
				sumNeg += num;
				cNeg++;
			}
		}
		System.out.println("Total Positive is: " + sumPos);
		System.out.println("Average Positive is: " + sumPos/cPos);
		System.out.println("Total Negative is: " + sumNeg);
		System.out.println("Average Negative is: " + sumNeg/cNeg);
	}
	
	
	
}