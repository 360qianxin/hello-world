package chapter1;

import java.io.PrintStream;
import java.util.Scanner;

class ������
{
  public static void main(String[] paramArrayOfString)
  {
    Scanner localScanner = new Scanner(System.in);
    System.out.println("------------------------------��������Ϸ------------------------------");
    GameHelp();
    zdycd();
  }
  
  public static void zdycd()
  {
    Scanner localScanner = new Scanner(System.in);
    System.out.println("***�Զ���˵�***");
    System.out.print("��ָ����Ҫ�µ����ַ�Χ   0-");
    int i = localScanner.nextInt();
    System.out.print("��������Ҫ�µĴ���:");
    int j = localScanner.nextInt();
    if (j >= i)
    {
      System.out.println("ͬѧ�������û�´�Ļ������ֲ���һ�����Բ¶ԡ���������������һ�°ѣ���������Ϳ�һ�°�����");
      zdycd();
    }
    else
    {
      csz(i, j);
    }
  }
  
  public static void csz(int paramInt1, int paramInt2)
  {
    Scanner localScanner = new Scanner(System.in);
    
    System.out.println("*******************************************************************");
    System.out.println("\t��ָ���ķ�Χ��0-" + paramInt1);
    System.out.println("\t���µĴ���Ϊ" + paramInt2);
    System.out.println("*******************************************************************");
    int i = (int)(Math.random() * paramInt1);
    for (int j = 1; j < paramInt1; j++)
    {
      int k = paramInt2 - j;
      System.out.print("��������Ҫ�µ�����(һ��: " + paramInt2 + "��  ��ʣ: " + k + "��  ��ǰ��:" + j + "��):");
      int m = localScanner.nextInt();
      if (k == 0)
      {
        System.out.println("          �Բ������Ѿ�û�л����ˣ����ʾ���֭�µ�����Ϊ:  " + i + "  ��Ǹ���´��ˣ�");
        break;
      }
      if (m == i)
      {
        System.out.println("******************��ô��������������" + j + "�Ͳ¶��ˣ�******************");
        break;
      }
      if (m > i) {
        System.out.println("\n                            �µ�̫���ˣ�Сһ�㣡\n");
      } else if (m < i) {
        System.out.println("\n                            �µ�̫С�ˣ���һ�㣡\n");
      }
    }
  }
  
  public static void GameHelp()
  {
    System.out.println("**************************** GameHelp ************************\n\t1.�������ᵯ���Զ���˵�,�������ڲ˵����趨.\n\t2.������������Ҫ�µ����ֵ����ֵ\n\t3.��СֵĬ��Ϊ0\n\t4.�µĴ������ܴ��ڵ������µķ�Χ\n**************************** GameHelp End ****************************");
  }
}
