package chapter1;

class Farther{

 public static void prt(String s){

 System.out.println(s);

 }

 Farther(){

 prt("The Farther.");

 }

 Farther(String name){

 prt("The Farther name is:"+name);

 }

}


public class Son extends Farther{

 Son(){

 super(); //调用父类构造函数

 prt("The Son.");

 }

 Son(String name){

 super(name);//调用父类具有相同形参的构造函数

 prt("His name is:"+name);

 }

 Son(String name,int age){

 this(name);//调用当前具有相同形参的构造函数

 prt("His age is:"+age);

 }

 public static void main(String[] args){

 Son son1 = new Son();

 son1 = new Son("applet");

 son1 = new Son("applet",20);

 Son son2 = new Son("applet");

 Son son3 = new Son("applet",20);

 }

}
