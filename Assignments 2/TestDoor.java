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

public class TestDoor
{
	static Door Door1;
	static Door Door2;
	static Door Door3;
	
	static Scanner input=new Scanner(System.in);

	public static void main(String[] args)
	{
		Door1=new Door("Enter");
		Door2=new Door("Exit");
		Door3=new Door("Treasure");
		
		Door1.setOpen();
		Door1.setUnlocked();
		Door3.setOpen();
		
		boolean done = false;
		int choice;
		
		do
		{
			chooseDoor();
			choice = input.nextInt();
			
			switch(choice)
			{
				case 1:
					DOOR1();
					break;
				case 2:
					DOOR2();
					break;
				case 3:
					DOOR3();
					break;
				case 4:
					System.out.println("\n\n---------- Door Status ----------\n");
			
					if(Door1.isLocked()==true)
					{
						System.out.print("ENTER door is LOCKED and ");
					}
			
					else
					{
						System.out.print("ENTER door is UNLOCKED and ");
					}
			
					if(Door1.isClosed()==true)
					{	
						System.out.print("CLOSED\n\n");
					}
			
					else
					{
						System.out.print("OPEN\n\n");
					}
					
					if(Door2.isLocked()==true)
					{
						System.out.print("EXIT door is LOCKED and ");
					}

					else
					{
						System.out.print("EXIT door is UNLOCKED and ");
					}

					if(Door2.isClosed()==true)
					{	
						System.out.print("CLOSED\n\n");
					}

					else
					{
						System.out.print("OPEN\n\n");
					}

					if(Door3.isLocked()==true)
					{
						System.out.print("TREASURE door is LOCKED and ");
					}
			
					else
					{
						System.out.print("TREASURE door is UNLOCKED and ");
					}
			
					if(Door3.isClosed()==true)
					{	
						System.out.print("CLOSED\n\n");
					}

					else
					{
						System.out.printf("OPEN\n\n");
					}
			
					System.out.println("---------- Door Status ----------\n");
					break;
				default:
					System.out.println("<<<< Out of choice range select again >>>>\n");
				}
	
		}while(!done);
	}

	public static void Choices()
	{
		System.out.println("\n--------- choices ---------\n\n");
		System.out.println("1. OPEN door");
		System.out.println("2. CLOSE door");
		System.out.println("3. LOCK door");
		System.out.println("4. UNLOCK door");
		System.out.println("5. Check current door status");
		System.out.println("6. Go Back to choose another door");
		System.out.print("\n\nEnter Choice: ");
	}

	public static void chooseDoor()
	{
		System.out.println("\n\n--------- Choose Your Door --------\n\n");
		System.out.println("1. Enter door");
		System.out.println("2. Exit door");
		System.out.println("3. Treasure door");
		System.out.println("4. All Door Statuses");
		System.out.print("\n\nEnter Choice: ");
	}

	public static void DOOR1()
	{
		int choice;
		boolean done = false;
		do
		{
			Choices();
			choice=input.nextInt();
			
			/*for(int i=0;i<6;i++)
			{
				System.out.println();
			}*/
				
			switch(choice)
			{
				case 1:
					Door1.open();
					break;
				case 2:
					Door1.close();
					break;
				case 3:
					Door1.lock();
					break;
				case 4:
					Door1.unlock();
					break;
				case 5:
					if(Door1.isLocked()==true)
					{
						System.out.println("---------- The ENTER Door Status ----------\n");
						System.out.print("Door is LOCKED and ");
					}
					else
					{
						System.out.println("---------- The ENTER Door Status ----------\n");
						System.out.print("Door is UNLOCKED and ");
					}
					if(Door1.isClosed()==true)
					{	
						System.out.print("CLOSED\n\n");
						System.out.println("---------- The ENTER Door Status ----------\n");
					}
					else
					{
						System.out.printf("OPEN\n\n");
						System.out.println("---------- The ENTER Door Status ----------\n");
					}
					break;
				case 6:
					done = true;
					break;
				default:
					System.out.print("<<<< Out of choice range select again >>>>\n");
				}
		}while(!done);
	}
	
	public static void DOOR2()
	{
		int choice;
		boolean done = false;
		
		do
		{
			Choices();
			choice=input.nextInt();

				/*for(int i=0;i<6;i++)
				{
					System.out.println();
				}*/
			switch(choice)
			{	
				case 1:
					Door2.open();
					break;
				case 2:
					Door2.close();
					break;
				case 3:
					Door2.lock();
					break;
				case 4:
					Door2.unlock();
					break;
				case 5:
					if(Door2.isLocked()==true)
					{
						System.out.println("---------- The EXIT Door Status ----------\n");
						System.out.print("Door is LOCKED and ");
					}
					else
					{
						System.out.println("---------- The EXIT Door Status ----------\n");
						System.out.print("Door is UNLOCKED and ");
					}
					if(Door2.isClosed()==true)
					{	
						System.out.print("CLOSED\n\n");
						System.out.println("---------- The EXIT Door Status ----------\n");
					}
					else
					{
						System.out.printf("OPEN\n\n");
						System.out.println("---------- The EXIT Door Status ----------\n");
					}
					break;
				case 6:
					done = true;
					break;
				default:
					System.out.print("<<<< Out of choice range select again >>>>\n");
			}
		}while(!done);
	}

	public static void DOOR3()
	{
		int choice;
		boolean done = false;
				
				do
				{
					Choices();
					choice=input.nextInt();
					
					/*for(int i=0;i<6;i++)
					{
						System.out.println();
					}*/
						
					switch(choice)
					{
						case 1:
							Door3.open();
							break;
						case 2:
							Door3.close();
							break;
						case 3:
							Door3.lock();
							break;
						case 4:
							Door3.unlock();
							break;
						case 5:
							if(Door3.isLocked()==true)
							{
								System.out.println("---------- The TREASURE Door Status ----------\n");
								System.out.print("Door is LOCKED and ");
							}
							else
							{
								System.out.println("---------- The TREASURE Door Status ----------\n");
								System.out.print("Door is UNLOCKED and ");
							}
							if(Door3.isClosed()==true)
							{	
								System.out.print("CLOSED\n\n");
								System.out.println("---------- The TREASURE Door Status ----------\n");
							}
							else
							{
								System.out.printf("OPEN\n\n");
								System.out.println("---------- The TREASURE Door Status ----------\n");
							}
							break;
						case 6:
							done = true;
							break;
						default:
							System.out.print("<<<< Out of choice range select again >>>>\n");
					}
				}while(!done);
	}
}
