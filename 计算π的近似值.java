package chapter1;
 
import java.util.Scanner;  
public class ����еĽ���ֵ {  
public static void main(String[] args) {  
    Scanner scan=new Scanner(System.in);  
    System.out.println("�������Բ������");  
    int n=scan.nextInt();  
    cut(n);  
      
}  
static void cut(int n){  
    double y=1.0;  
    for(int i=0;i<=n;i++){  
        double ��=3*Math.pow(2, i)*y;  
        System.out.println("��"+i+"���и�,Ϊ��"+(6+6*i)+"���Σ�Բ���ʦС�"+��);  
        y=Math.sqrt(2-Math.sqrt(4-y*y));  
    }  
      
}  
}
