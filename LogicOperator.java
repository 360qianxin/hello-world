package chapter1;

public class LogicOperator {
	public static void main (String[] args){
		boolean b1=(10>3)&&(10<3);//���������ʽ����������
		boolean b2=(10>3)||(10<3);//���������ʽ����������
		boolean b3=!(10<3);
		System.out.println("(10>3)&&(10<3)��ֵΪ:"+b1);
		System.out.println("(10>3)||(10<3)��ֵΪ:"+b2);
		System.out.println("!(10<3)��ֵΪ:"+b3);
	}

}
