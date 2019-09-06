package chapter1;

public class Arithmetic {
public static void main (String[] args){
	int i1=20;
	int i2=4;
	int i3=i1/i2;
	double d1=20;
	double d2=4;
	double d3=d1/d2;
	float f1=7.5f;
	float f2=3f;
	float f3=f1%f2;
	int a=3;
	int b=3;
	System.out.println("整型数据i3的值为:20/4="+i3);
	System.out.println("浮点型数据d3的值为:20/4"+d3);
	System.out.println("7.5%3="+f3);
	System.out.println("原来a的值为:"+a+",b的值为:"+b);
	System.out.println("++a="+(++a));
	System.out.println("b++="+(b++));
	System.out.println("进行自加运算后，a的值为:"+a+",b的值为:"+b);
	}
}
