// Name: Patrick Roanhouse

/*

CS 55 - Java Programming


*/


import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.io.*;
import java.awt.event.*;
import java.util.Scanner;

public class EncodeDecode
{
	static char convert(char character, int value)
	{
		String letters = "abcdefghijklmnopqrstuvwxyz";
		String encodingkey = "kngcadsxbvfhjtiumylzqropwe";
		String Letters = " ";
		String Encoder = " ";
		
		for(int i=0;i<letters.length();i++) 
		{
			Letters+= letters.charAt(i);
			Encoder+=encodingkey.charAt(i);
		}
		Letters = Letters.toUpperCase();
		Encoder = Encoder.toUpperCase();

		if(value==0) 
		{
			int position = -1;
			position = Letters.indexOf(character);
			if(position==-1) 
			{
				position = letters.indexOf(character);
				return encodingkey.charAt(position);
			}
			else 
			{
				return Encoder.charAt(position);
			}
		}
		else 
		{
			int position = -1;
			position = Encoder.indexOf(character);
			
			if(position==-1) 
			{
				position = encodingkey.indexOf(character);
				return letters.charAt(position);
			}
			else
			{
				return Letters.charAt(position);
			}
		}
	}

	public static void main(String args[]) throws IOException 
	{
		System.out.println("If you want to encode a file, enter 0");
		System.out.println("If you want to decode a file, enter 1");
		System.out.print("Choice: ");
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		
		if(input==0) 
		{
			System.out.println("Enter input file name");
			System.out.print("Filename: ");
			String datafile = scanner.next();
			System.out.println("Enter output file name");
			System.out.print("Encoded Filename: ");
			String output = scanner.next();
			File fileIn = new File(datafile);
			File fileOut = new File(output);
			FileReader fileReader = new FileReader(fileIn);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String currentLine;
			BufferedWriter bufferedWriter= new BufferedWriter(new FileWriter(output));
			
			while((currentLine=bufferedReader.readLine())!=null) 
			{
				for(int i=0;i<currentLine.length();i++)
				{
					if(Character.isLetter(currentLine.charAt(i))) 
					{
						bufferedWriter.write(convert(currentLine.charAt(i),0));
					}
					else
					{
						bufferedWriter.write(currentLine.charAt(i));
					}
				}
			}
			bufferedReader.close();
			bufferedWriter.close();
			fileReader.close();
		}
		else if(input==1) 
		{
			System.out.println("Enter input file name");
			System.out.print("Encoded Filename: ");
			String datafile = scanner.next();
			System.out.println("Enter output file name");
			System.out.print("Decoded Filename: ");
			String output = scanner.next();
			File fileIn = new File(datafile);
			File fileOut = new File(output);
			FileReader fileReader = new FileReader(fileIn);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String currentLine;
			BufferedWriter bufferedWriter= new BufferedWriter(new FileWriter(output));
			
			while((currentLine=bufferedReader.readLine())!=null)
			{
				for(int i=0;i<currentLine.length();i++) 
				{
					if(Character.isLetter(currentLine.charAt(i))) 
					{
						bufferedWriter.write(convert(currentLine.charAt(i),1));
					}
					else 
					{
						bufferedWriter.write(currentLine.charAt(i));
					}
				}
			}
			
			bufferedReader.close();
			bufferedWriter.close();
			fileReader.close();

		}

	}
}