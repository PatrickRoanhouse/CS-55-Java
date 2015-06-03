// Name: Patrick Roanhouse

/*

CS 55 - Java Programming


*/


import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.io.*;
import java.awt.event.*;
import java.util.Date;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class TestRational extends JFrame implements ActionListener {
    Rational[] a, b, c;
    JTextArea areaA, areaB, areaC;

    public TestRational(String title){
        super(title);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        a = new Rational[10];
        b = new Rational[10];
        c = new Rational[10];

        //Populates array a with random rationals between 0 & 1
        for(int i = 0; i < 10; i++){
            int x = 1 + (int)(Math.random() * ((9 - 1) + 1));
            int y = 1 + (int)(Math.random() * ((9 - 1) + 1));
            while(x == y){
                y = 1 + (int)(Math.random() * ((9 - 1) + 1));
            }
            if(x > y){
                a[i] = new Rational(y, x);
            }else{
                a[i] = new Rational(x, y);
            }
        }
        //Populates array b with random rationals between 0 & 1
        for(int i = 0; i < 10; i++){
            int x = 1 + (int)(Math.random() * ((9 - 1) + 1));
            int y = 1 + (int)(Math.random() * ((9 - 1) + 1));
            while(x == y){
                y = 1 + (int)(Math.random() * ((9 - 1) + 1));
            }
            if(x > y){
                b[i] = new Rational(y, x);
            }else{
                b[i] = new Rational(x, y);
            }
        }

        //Turns rational arrays into strings for text area
        String textA = "", textB = "";
        for(int i = 0; i < 10; i++){
            textA += a[i] + "\n";
            textB += b[i] + "\n";
        }
        System.out.println(textA);

        areaA = new JTextArea(textA, 10, 5);
        areaB = new JTextArea(textB, 5, 5);
        areaC = new JTextArea("", 5, 5);

      
        areaA.setEditable(false);
        areaB.setEditable(false);
        areaC.setEditable(false);
        JScrollPane scrollA = new JScrollPane(areaA, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        JScrollPane scrollB = new JScrollPane(areaB, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        JScrollPane scrollC = new JScrollPane(areaC, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollA.setPreferredSize(new Dimension(70, 400));
        scrollB.setPreferredSize(new Dimension(70, 400));
        scrollC.setPreferredSize(new Dimension(70, 400));

        GridLayout btnLayout = new GridLayout(2, 1);
        JPanel btnPanel = new JPanel(btnLayout);
        JButton addBtn = new JButton("Add");
        JButton subBtn = new JButton("Subtract");
        JButton multBtn = new JButton("Multiply");
        JButton divBtn = new JButton("Divide");
        JButton sortBtn = new JButton("Sort");
        addBtn.addActionListener(this);
        subBtn.addActionListener(this);
        multBtn.addActionListener(this);
        divBtn.addActionListener(this);
        sortBtn.addActionListener(this);
        btnPanel.add(addBtn);
        btnPanel.add(subBtn);
        btnPanel.add(multBtn);
        btnPanel.add(divBtn);
        btnPanel.add(sortBtn);

        add(scrollA);
        add(scrollB);
        add(scrollC);
        add(btnPanel);
        pack();
    }

    public static void main(String[] args){
        TestRational tr = new TestRational("Rationals");
        tr.setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        String command = e.getActionCommand();

        if(command.equals("Add")){
            String s = "";
            for(int i = 0; i < 10; i++){
                c[i] = a[i].add(b[i]);
                s += c[i] + "\n";
            }
            areaC.setText(s);
        }
        if(command.equals("Subtract")){
            String s = "";
            for(int i = 0; i < 10; i++){
                c[i] = a[i].sub(b[i]);
                s += c[i] + "\n";
            }
            areaC.setText(s);
        }
        if(command.equals("Multiply")) {
            String s = "";
            for (int i = 0; i < 10; i++) {
                c[i] = a[i].mult(b[i]);
                s += c[i] + "\n";
            }
            areaC.setText(s);
        }
        if(command.equals("Divide")){
            String s = "";
            for(int i = 0; i < 10; i++){
                c[i] = a[i].divide(b[i]);
                s += c[i] + "\n";
            }
            areaC.setText(s);
        }
        //Sorts the three arrays, appends their text areas
        if(command.equals("Sort")){
            String scrolla = "------\n";
            String scrollb= "------\n";
            String scrollc = "------\n";
            for(int i = 0; i < 10; i++){
                for(int j = i+1; j < 10; j++){
                    if(a[j].compare(a[i]) == -1){
                        Rational temp = a[i];
                        a[i] = a[j];
                        a[j] = temp;
                    }
                    if(b[j].compare(b[i]) == -1){
                        Rational temp = b[i];
                        b[i] = b[j];
                        b[j] = temp;
                    }
                    if(c[j].compare(c[i]) == -1){
                        Rational temp = c[i];
                        c[i] = c[j];
                        c[j] = temp;
                    }
                }
                scrolla += a[i] + "\n";
                scrollb += b[i] + "\n";
                scrollc += c[i] + "\n";
            }
            
            areaA.append(scrolla);
            areaB.append(scrollb);
            areaC.append(scrollc);
        }
    }
}
