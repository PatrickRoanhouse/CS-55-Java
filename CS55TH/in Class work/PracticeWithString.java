import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.io.*;
//
/*    */
public class PracticeWithString
{


 public static void main(String [] args)
 {
    String s1 = new String("Lisa");
	String s2="Lisa";
	String s3="Lisa";
    String s4=new String("Lisa");
 
    boolean x= s2==s3;
    boolean y= s1==s4;
	boolean z= s1.equals(s4);
	boolean t= s2.equals(s3);
	String out="x="+x+"\n"+
	                   "y="+y+"\n"+
					   "Z="+z+"\n"+
					   "t="+t+"\n";
	System.out.println(out);
	JOptionPane.showMessageDialog(null,out);				   
	System.out.print("Hello");
	System.out.println(" From Jupiter");
	
 
   String str=JOptionPane.showInputDialog
   ("Enter Phrase");
   
   System.out.println(str.toLowerCase() + "\n has "+str.length()+
   " characters");
   
   char ch= str.charAt(0);
   System.out.println("the first character is :"+ch);
   
   for(int i=str.length()-1; i >=0 ; i--)
    {
      System.out.print(str.charAt(i));

    }	
   
  }
}  
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   