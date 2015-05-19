import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.io.*;

public class DicePractice
{
 public static void main(String [] args)
  {
    int n1=0,n2=0,n3=0,n4=0,n5=0,n6=0;
	
   for(int i=0; i < 1000 ; i++)
   {
    int dice= (int) (Math.random()*6) + 1;
    switch (dice)
	{
	  case 1 : n1++ ; break;
	  case 2 : n2++ ; break;
	  case 3 : n3++ ; break;
	  case 4 : n4++ ; break;
	  case 5 : n5++ ; break;
	  case 6 : n6++ ; break;
	  default : System.out.printf("bad input for dice");
	}
  }
	String out="Dice has thrown 1000 times\n";
	out+="Ocurrences of 1's are: "+n1+"\n"
	    +"Ocurrences of 2's are: "+n2+"\n"
        +"Ocurrences of 3's are: "+n3+"\n"
		+"Ocurrences of 4's are: "+n4+"\n"
		+"Ocurrences of 5's are: "+n5+"\n"
		+"Ocurrences of 6's are: "+n6+"\n";
		
		MyIO.display(out,Color.YELLOW,Color.BLUE,32);
		
		
		System.exit(0);
   }
  
  
  
}