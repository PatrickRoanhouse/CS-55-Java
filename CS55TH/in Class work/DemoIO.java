// name:
/* 
   
*/
import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.io.*;
import java.awt.event.*;

public class DemoIO
{

public static void main(String args[])
{
  Scanner input= new Scanner(System.in);
  
  System.out.print("What is your name:\n");
  String name=input.next();
  System.out.println(name + " Wish you well");
  System.out.printf("%s Wish you Well\n",name);
  System.exit(0);
}


}













