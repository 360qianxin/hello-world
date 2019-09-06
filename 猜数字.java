package chapter1;

import java.io.PrintStream;
import java.util.Scanner;

class 猜数字
{
  public static void main(String[] paramArrayOfString)
  {
    Scanner localScanner = new Scanner(System.in);
    System.out.println("------------------------------猜数字游戏------------------------------");
    GameHelp();
    zdycd();
  }
  
  public static void zdycd()
  {
    Scanner localScanner = new Scanner(System.in);
    System.out.println("***自定义菜单***");
    System.out.print("请指定您要猜的数字范围   0-");
    int i = localScanner.nextInt();
    System.out.print("请输入您要猜的次数:");
    int j = localScanner.nextInt();
    if (j >= i)
    {
      System.out.println("同学，如果我没猜错的话您这种操作一定可以猜对。您还是重新设置一下把！如果不懂就看一下帮助！");
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
    System.out.println("\t您指定的范围是0-" + paramInt1);
    System.out.println("\t您猜的次数为" + paramInt2);
    System.out.println("*******************************************************************");
    int i = (int)(Math.random() * paramInt1);
    for (int j = 1; j < paramInt1; j++)
    {
      int k = paramInt2 - j;
      System.out.print("请输入您要猜的数字(一共: " + paramInt2 + "次  还剩: " + k + "次  当前第:" + j + "次):");
      int m = localScanner.nextInt();
      if (k == 0)
      {
        System.out.println("          对不起，您已经没有机会了！您绞尽脑汁猜的数字为:  " + i + "  抱歉您猜错了？");
        break;
      }
      if (m == i)
      {
        System.out.println("******************那么聪明，仅仅用了" + j + "就猜对了！******************");
        break;
      }
      if (m > i) {
        System.out.println("\n                            猜的太大了，小一点！\n");
      } else if (m < i) {
        System.out.println("\n                            猜的太小了，大一点！\n");
      }
    }
  }
  
  public static void GameHelp()
  {
    System.out.println("**************************** GameHelp ************************\n\t1.接下来会弹出自定义菜单,您可以在菜单中设定.\n\t2.您可以设置所要猜的数字的最大值\n\t3.最小值默认为0\n\t4.猜的次数不能大于等于所猜的范围\n**************************** GameHelp End ****************************");
  }
}
