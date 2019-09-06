package chapter1;

import java.util.Scanner;
public class 体重指数计算器 {
  public static void main(String[] args){
     Scanner sc = new Scanner (System.in);
    System.out.println("Hi!请输入您的性别(0表示女性,1表示男性):");
    int sex=sc.nextInt();
    System.out.print("请输入您的身高(米):");
    float f2 = sc.nextFloat();
    System.out.print("请输入您的体重(千克):");
    float f3 = sc.nextFloat();
    if (sex==0)
    {
      System.out.println("Hi,漂亮的MM!请稍等一下:");
      float f1 = f3 / (f2 * f2);
      System.out.println("Hi,漂亮的MM，您的体重指数为:  " + f1);
      if (f1 < 19.0F)
      {
        System.out.println("MM，您太轻了，多吃饭把！");
        return;
      }
      if ((f1 < 24.0F) && (f1 >= 19.0F))
      {
        System.out.println("MM，您的指数超过全国99%的人");
        return;
      }
      if ((f1 < 29.0F) && (f1 > 24.0F))
      {
        System.out.println("MM,要加强锻炼哦！");
        return;
      }
      System.out.println("您这就很尴尬了，您是不是输错了，再试一次吧");
      return;
    }
    System.out.println("Man 你好，我们正在计算！");
    float f1 = f3 / (f2 * f2);
    System.out.println("Man你好，您的体重指数为:  " + f1);
    if (f1 < 20.0F)
    {
      System.out.println("帅哥，潇洒的您太轻了，要多吃饭哦！");
      return;
    }
    if ((f1 < 25.0F) && (f1 >= 20.0F))
    {
      System.out.println("哟，正好来，爆个照片看看。");
      return;
    }
    if ((f1 < 35.0F) && (f1 > 30.0F))
    {
      System.out.println("额，怎么说呢，您改减肥了！");
      return;
    }
    System.out.println("您这就很尴尬了，您是不是输错了，再试一次吧");
  }
}

