package chapter1;

public class CompareOperator {
	public static void main (String[] args){
		int a=31,b=4;
		boolean b1=a>b;//比较a是否大于b
		boolean b2=a<b;//比较a是否小于b
		boolean b3=a==b;//比较a与b是否相等
		boolean b4=a!=b;//比较a与b是否不相等
		System.out.println("a>b为:"+b1);
		System.out.println("a<b为:"+b2);
		System.out.println("a等于b为:"+b3);
		System.out.println("a不等于b为:"+b4);
}
}