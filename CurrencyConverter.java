package chapter1;

public class CurrencyConverter{
	public static void main(String[] args){
	int rmb = 500;
	int dollar,pound,jpy;
	float rate1=6.35f,rate2=9.64f,rate3=0.0526f;
	dollar=(int)(rmb/rate1);
	pound=(int)(rmb/rate2);
	jpy=(int)(rmb/rate3);
	System.out.println("500Ԫ����ҿɶһ�"+dollar+"��Ԫ");
	System.out.println("500Ԫ����ҿɶһ�"+pound+"Ӣ��");
	System.out.println("500Ԫ����ҿɶһ�"+jpy+"��Ԫ");
	}
	}
