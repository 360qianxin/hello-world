package chapter1;

import java.util.Scanner;

public class main {  
  public static boolean isPrime(int i)  
  {  
      boolean isPrime = true;  
      //����i��ƽ�����Ϳ����ж�  
      for (int j = 2; j<=Math.sqrt(i);j++)  
      {  
          if(i%j==0)  
              isPrime = false;  
      }  
      return isPrime;  
  }  
  public static void main(String[] args) {  
      Scanner in = new Scanner(System.in);
      System.out.println("������һ������");
      int n = in.nextInt();  
      System.out.println("�����ʾΪ��");
      
      String out = n + "=";  
      
      if(isPrime(n))  
      {  
          out = out+ n;  
      }  
      else 
      {  
          while(n!=1)  
          {  
              for(int j=2;j<=n;j++)  
              {  
                  //�����һ���������⴦��  
                  if(j==n)  
                  {  
                      n=1;  
                      out = out + j;    
                      break;  
                  }  
                  if(n%j==0)  
                  {  
                      n=n/j;  
                      out = out + j+"x";    
                      break;  
                  }  
              }  
          }  
      }  
      System.out.println(out);  
      in.close();  
  }  

}
