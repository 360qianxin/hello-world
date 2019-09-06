package chapter1;

public class CurrencyConverter{
	public static void main(String[] args){
	int rmb = 500;
	int dollar,pound,jpy;
	float rate1=6.35f,rate2=9.64f,rate3=0.0526f;
	dollar=(int)(rmb/rate1);
	pound=(int)(rmb/rate2);
	jpy=(int)(rmb/rate3);
	System.out.println("500元人民币可兑换"+dollar+"美元");
	System.out.println("500元人民币可兑换"+pound+"英镑");
	System.out.println("500元人民币可兑换"+jpy+"日元");
	}
	}
