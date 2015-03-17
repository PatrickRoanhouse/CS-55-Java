import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.io.*;

public class MyIO
{

  private MyIO()
  {
  
  }

  public static int getInt(String s)
  {
     String strNum="";
	 int n=0;
	 boolean ok=false;
	 
	 while ( ! ok )
	 {
	    try
		{
      strNum=JOptionPane.showInputDialog
	(s);
		n1= Integer.parseInt(strNum);
		ok= true;
		}
		catch (Exception ex)
		{
		JOptionPane.showMessageDialog(null,
		strNum +" is not integer try again");
		}
	 
	 }
	 
	 }
    
    return n1;
  }
public static void display(String ss)
  {
   JOptionPane.showMessageDialog(null,ss);
   }
   
public static void display(String ss,Color bc,Color fc, int size)
{
   
   JTextArea jt= new JTextArea(20,25);
   jt.setBackground(bc);
   jt.setForeground(fc);
   Font f = new Font("Times new Roman",Font.BOLD + Font.ITALIC, size);
   jt.setFont(f);
   jt.setText(ss);
   
   JScrollPane sr = new JScrollPane(jt);
   
   JOptionPane.showMessageDialog(null,sr);




}   


}