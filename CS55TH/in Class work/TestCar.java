import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.io.*;


                     
public class TestCar
{

 public static void main(String [] args)
 {
     Car c1 = new Car();
	 Car c2 = new Car();
	 c1.setMake("Lamb");
	 c2.setMake("Nissan");
	 c1.setPrice(666666.0);
	 c2.setPrice(23000.0);
	 c1.setYear(2014);
	 c2.setYear(2015);
	 c1.setColor("Red");
	 c2.setColor("Black");
	 System.out.println(c1.toString()+c2.toString());
	 
	 if(c1.getPrice() > c2.getPrice())
	   System.out.println("The Car is "+c1.getMake());
	 
	 
	Car    [] x= new Car[10];
	
	for(int i= 0; i < x.length; i++)
		x[i]= Car.makeACar();
	 
	 
	 
	 
	 
	 
 
 
 }



}