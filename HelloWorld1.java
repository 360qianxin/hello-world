package chapter1;

import java.util.Scanner;

public class HelloWorld1  
{
	public static void main(String[] args) 
	{ 
		Scanner in = new Scanner(System.in);
    System.out.println("请输入：");
    
    int n = in.nextInt();  
    System.out.println("结果显示为：");
		System.out.println("Hello World!");
	}
}