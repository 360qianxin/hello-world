package chapter1;

//Ӧ��ע����ǣ��̳г�������࣬Ҫ��������еĳ��󷽷�Ҫ��ʵ����  
abstract class personClass //������  
{    
  public String sex;//������  
  public abstract void method(); //���󷽷���  
}  
class man extends personClass //�Գ�����Ϊģ�����  
{    
  public  void method()//���󷽷���ʵ����  
  {  
     System.out.println("�̳г�����ķ�����ʵ�ֻ���");  
  }  
}  
public  class Example6  
{  
  public static void main(String[] args)  
  {  
      man boys = new man();//����һ������  
      boys.sex = "male";//������һ����ֵ  
      System.out.println(boys.sex);  
      boys.method();//����man���еķ���  
  }  
} 