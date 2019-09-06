package chapter1;

public class for循环1100的和 {

	public static void main(String[] args) {
	//sum存储和
		int sum=0;
		//i表示循环变量
		int i;
		//i=0完成循环变量的初始化，i<=100表示循环的条件，i++修改循环变量的值
		for(i=0;i<=100;i++){
//循环体
			sum+=i;
			System.out.println("和为："+sum);}
	}

}
