package chapter1;

public class 偶数20 {

	public static void main(String[] args) {
int i=1;
do{
	if(i%2==0);//通过取余运算判断是否为偶数
		System.out.print(i+"");
		i++;//循环变量累加
}while(i<=20);//当i不大于20时，执行循环体
	}

}
