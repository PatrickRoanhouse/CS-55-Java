// Name: Patrick Roanhouse

/*

CS 55 - Java Programming


*/


import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.io.*;
import java.awt.event.*;


public class DiceGame
{

	public static void main (String[] args)
	{
		int bank = 1000;
		int bet = 1;
		int die1 = 0;
		int die2 = 0;
		int dietotal = 0;
		int wl = 0;
		
	
		JOptionPane.showMessageDialog(null,"Welcome to the dice table!\nBet 0 to leave.\nGood luck!");
	
		
		
		while (bet != 0){
			
			bet = placeBet(bet);
			if (bet == 0)
			{
			 	leaveCasino(bank);
			}
			bank = bank - bet;
			
			
			JOptionPane.showMessageDialog(null, "You Bet: $" + bet +"\nYour bank has $" + bank);
			dieRoll(die1,die2, dietotal, wl);
			if (wl > 0)
			{
				bank = bank + (bet * 3);
			}
		}
		
		leaveCasino(bank);
		
	}
	
	public static int placeBet (int bet)
	{
		bet = Integer.parseInt(JOptionPane.showInputDialog("Place Bet, making a 0 bet leaves the game"));
		
		return(bet);
	}
	
	public static int dieRoll (int die1, int die2, int dietotal, int wl)
	{
		die1 = (int)(Math.random()*6)+1;
		die2 = (int)(Math.random()*6)+1;
		dietotal = die1 + die2;
		JOptionPane.showMessageDialog(null,"The first die rolled a " + die1);
		JOptionPane.showMessageDialog(null,"The second die rolled a " + die2);
		
		if ( dietotal == 7 || dietotal == 11)
		{
			JOptionPane.showMessageDialog(null,"You got a " + dietotal + " You win!!!!");
			wl = 1;
		}
		else if (dietotal != 7 || dietotal != 11)
		{
	
			JOptionPane.showMessageDialog(null,"You got a " + dietotal + " You lost :(");
			wl = 0;
		}
		
		return(wl);
	}
	
	public static void leaveCasino(int balance)
	{
		JOptionPane.showMessageDialog(null,"You leave the casino with $" + balance + " in the bank.");
		System.exit(0);	
	}
}


