package chapter1;

import java.applet.*;
import java.awt.*;
import java.io.*;

public class TestTxt extends Applet {
 public void paint(Graphics g){  
  setSize(900,600);
  String re;
  FileReader fr = null;
  try{
   fr = new FileReader("D:/java/xin/txt.txt");//设置txt.txt文件放置的位置
   BufferedReader br = new BufferedReader(fr);
   while ((re = br.readLine()) != null){
   String sp [] = re.split(" ");

   String a2 = sp[0];
   String b2 []= sp[2].split(",");
   String c2 []= sp[1].split(",");

   wofill(g,a2,b2,c2);
   }
   br.close();
   fr.close();
  } catch (NullPointerException e){
   System.out.println("Error ! ");
  } catch (IOException e){
   e.printStackTrace();
  }
 }
 
 public void wofill(Graphics g,String a2,String b2[],String c2[]){
  //-----------------------
  int rr = Integer.parseInt(c2[0]);
  int gg = Integer.parseInt(c2[1]);
  int bb = Integer.parseInt(c2[2]);
  Color cc = new Color(rr,gg,bb);
  //-----------------------
  int x = Integer.parseInt(b2[0]);
  int y = Integer.parseInt(b2[1]);
  int w = Integer.parseInt(b2[2]);
  int h = Integer.parseInt(b2[3]);
  //-----------------------
  if(a2.equals("Rect")){
   g.setColor(cc);
   g.fillRect(x,y,w,h);
  }
  if(a2.equals("Oval")){
   g.setColor(cc);
   g.fillOval(x,y,w,h);
  }
  if(a2.equals("Triangle")){
   int m = Integer.parseInt(b2[4]);
   int n = Integer.parseInt(b2[5]);
   int xp1 [] = {x,y,w,x};
   int yp1 [] = {h,m,n,h};
   g.setColor(cc);
   g.fillPolygon(xp1,yp1,4);
  }
 }
}

