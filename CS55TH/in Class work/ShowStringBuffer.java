import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.io.*;

public class ShowStringBuffer
{

 public static void main(String args[])
 {
    StringBuffer sb= new StringBuffer("Hello From Jupiter XXXXXXXXXXXXXXXXXXXXXXXXXX	YYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYY");
	sb.append("ZZZZZZZZZZZzzzzzZZZ");
	sb.append(5 > 3);sb.append('F');
	int cp= sb.capacity();
	char [] a={'a','b','c'};
	sb.append(a,1,2);
	//sb.append('\uD840');
	System.out.println("====>>"+cp);
	System.out.println("====>>"+sb.length());
	System.out.println(sb);
	System.out.println("====Formatted:\n"+getFormat());
	
	
	System.exit(0);
}
public static String getFormat()
{
   int a=10; double b=37.80; String st="That is so Cool";
  return String.format("a=%d, b=%6.2f\n%s\n",a,b,st);

}


}	
	