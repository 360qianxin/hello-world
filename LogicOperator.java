package chapter1;

public class LogicOperator {
	public static void main (String[] args){
		boolean b1=(10>3)&&(10<3);//将两个表达式进行与运算
		boolean b2=(10>3)||(10<3);//将两个表达式进行与运算
		boolean b3=!(10<3);
		System.out.println("(10>3)&&(10<3)的值为:"+b1);
		System.out.println("(10>3)||(10<3)的值为:"+b2);
		System.out.println("!(10<3)的值为:"+b3);
	}

}
