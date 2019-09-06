package chapter1;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class TestPlay extends Applet{
 
 TextField tf1,tf2,tf3,tf4;
 Label lab1,lab2,lab3,lab4,lab5;
 Button bt1;
 
 public void init(){
  setSize(300,300);
  setBackground(Color.PINK);
  setVisible(true);
  setLayout(null);
  
  tf1 = new TextField();
  tf2 = new TextField();
  tf3 = new TextField();
  tf4 = new TextField();
  lab1 = new Label("Number");
  lab2 = new Label("Name");
  lab3 = new Label("=");
  lab4 = new Label("Result");
  lab5 = new Label("(1~520)");
  bt1 = new Button("OK");
  
  add(tf1);add(tf2);add(tf3);add(tf4);
  add(lab1);add(lab2);add(lab3);add(lab4);add(lab5);
  add(bt1);
  
  lab1.setBounds(20,15,50,30);
  lab2.setBounds(20,55,50,30);
  lab3.setBounds(70,95,20,30);
  lab4.setBounds(20,135,50,30);
  lab5.setBounds(220, 15, 50, 30);
  tf1.setBounds(90, 20, 120, 20);
  tf2.setBounds(90, 60, 120, 20);
  tf3.setBounds(90, 100, 120, 20);
  tf4.setBounds(90, 140, 120, 20);
  bt1.setBounds(220, 95, 50, 30);
  
  tf3.setEditable(false);
  tf4.setEditable(false);
  bt1.addActionListener(new abc());
 }
 
 class abc implements ActionListener{
  public void actionPerformed(ActionEvent e){
   
   int n1 = Integer.parseInt(tf1.getText());  
   String sss=tf2.getText();
   int res=0;
   //int len=0;
   //sss.length()<20?len=sss.length():len=20;
   for (int i=0;i<sss.length();i++){
    res += (int)sss.charAt(i)-96;
   }
   
   tf3.setText(""+res);
   if(res == n1){
    tf4.setText("Congratulations!");
   }else{
    tf4.setText("Unfortunately!");
   }

  }
 }
}
