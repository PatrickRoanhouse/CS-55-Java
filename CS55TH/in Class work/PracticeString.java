import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.io.*;
//
/*    */
public class PracticeString
{
 public static void main(String [] args)
 {
    String x=JOptionPane.showInputDialog
   ("Enter Phrase");
    System.out.println(x);
	
	char ch=x.charAt(0);
	String rest=x.substring(1);
	String result= rest + ch;
	System.out.println(result);
   
   
   
   
   
   
   
   
   

 }

}