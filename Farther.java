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

 super(); //���ø��๹�캯��

 prt("The Son.");

 }

 Son(String name){

 super(name);//���ø��������ͬ�βεĹ��캯��

 prt("His name is:"+name);

 }

 Son(String name,int age){

 this(name);//���õ�ǰ������ͬ�βεĹ��캯��

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
