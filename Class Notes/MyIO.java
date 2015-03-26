import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.io.*;

public class MyIO
{

  private MyIO()
  {
  
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