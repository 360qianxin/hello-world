package chapter1;

import java.util.Scanner;
public class ����Բ����{
public static void main(String[]args){
Scanner scan=new Scanner(System.in);
System.out.println("�����뾫�ȣ�");
double z=scan.nextDouble();
System.out.println("�ھ���Ϊ"+z+"�������£���Լ���ڣ�\n"+jishuPI(z));

}
static double jishuPI(double z){
double sum=2;
int n=1;
int m=3;
double t=2;
while(t>z){
t=t*n/m;
sum=sum+t;
n++;
m+=2;



}
return sum;
}

}