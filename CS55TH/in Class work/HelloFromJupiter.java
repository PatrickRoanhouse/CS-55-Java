
import java.awt.*;
import javax.swing.*;
import java.util.*;

//   Nmae :xxxxx
/*


*/
public class HelloFromJupiter
{

 public static void main(String args[])
 {
 
   System.out.println("Hello\nFrom\nJupiter");
   System.out.println("Hello From Jupiter");
   JOptionPane.showMessageDialog(null,"Hello From Jupiter");
 
   Font f= new Font("times new Roman",Font.BOLD+Font.ITALIC,32);
   
   JTextArea jt= new JTextArea(20,25);
   jt.setBackground(Color.YELLOW);
   jt.setForeground(Color.BLUE);
   jt.setFont(f);
   jt.setText("Hello From Jupiter");
 
 JOptionPane.showMessageDialog(null,jt);
 MyIO.display("Hello From Jupiter",Color.BLACK,Color.WHITE,32);
 }


}










