package chapter1;

import java.util.Scanner;
public class ����ָ�������� {
  public static void main(String[] args){
     Scanner sc = new Scanner (System.in);
    System.out.println("Hi!�����������Ա�(0��ʾŮ��,1��ʾ����):");
    int sex=sc.nextInt();
    System.out.print("�������������(��):");
    float f2 = sc.nextFloat();
    System.out.print("��������������(ǧ��):");
    float f3 = sc.nextFloat();
    if (sex==0)
    {
      System.out.println("Hi,Ư����MM!���Ե�һ��:");
      float f1 = f3 / (f2 * f2);
      System.out.println("Hi,Ư����MM����������ָ��Ϊ:  " + f1);
      if (f1 < 19.0F)
      {
        System.out.println("MM����̫���ˣ���Է��ѣ�");
        return;
      }
      if ((f1 < 24.0F) && (f1 >= 19.0F))
      {
        System.out.println("MM������ָ������ȫ��99%����");
        return;
      }
      if ((f1 < 29.0F) && (f1 > 24.0F))
      {
        System.out.println("MM,Ҫ��ǿ����Ŷ��");
        return;
      }
      System.out.println("����ͺ������ˣ����ǲ�������ˣ�����һ�ΰ�");
      return;
    }
    System.out.println("Man ��ã��������ڼ��㣡");
    float f1 = f3 / (f2 * f2);
    System.out.println("Man��ã���������ָ��Ϊ:  " + f1);
    if (f1 < 20.0F)
    {
      System.out.println("˧�磬��������̫���ˣ�Ҫ��Է�Ŷ��");
      return;
    }
    if ((f1 < 25.0F) && (f1 >= 20.0F))
    {
      System.out.println("Ӵ����������������Ƭ������");
      return;
    }
    if ((f1 < 35.0F) && (f1 > 30.0F))
    {
      System.out.println("���ô˵�أ����ļ����ˣ�");
      return;
    }
    System.out.println("����ͺ������ˣ����ǲ�������ˣ�����һ�ΰ�");
  }
}

