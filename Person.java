package chapter1;

class A  
{  
    public int age;             //���������ֶ�age  
   private String name;        //����˽���ֶ�name,��ʱnameΪ�������,����ͨ�����з������з���  
   public String getName() {  
       return name;  
   }  
   public void setName(String name) {  
       this.name = name;  
   }  
    
   public void eat()           //�����޲�����eat����  
   {  
      System.out.println("A can eat");  
   }  
   public void eat(String s)   //�����������eat����,ʵ�ַ�������  
   {  
      System.out.println("A can eat"+s);  
   }  
   public A()            //�����޲ι��캯��,ע���޷���ֵ����,��������ͬ��  
   {  
   }  
   public A(int age, String name) //��дһ�����������캯��,ע���޷���ֵ����,��������ͬ��  
   {  
       this.age = age;         //ǰһ��ageΪ������ֶ�,��thisָ��,��һ��ageΪ�����β�  
       this.name = name;       //ǰһ��nameΪ���������,��thisָ��,��Ϊ�ڱ����п�ֱ�ӷ���,��һ��nameΪ�����β�  
       }  
    
}  
public class Person  
{  
public static void main(String[] args)  
{  
    A A1 = new A();  //��������޲ι��캯��  
A1.age = 20;               //������Ĺ����ֶ�ֱ�Ӹ�ֵ  
A1.setName("zhangsan");      //����ʹ�ù����������ܸ���������Ը�ֵ  
System.out.println("��һ������Ϣ,����:"+A1.getName()+"����:"+A1.age);  
A1.eat();                  //���ö�����޲η���  
A A2 = new A(18, "lisi");//��������вι��캯��  
System.out.println("�ڶ�������Ϣ,����:" + A2.getName() + "����:" + A2.age);  
A2.eat(" ��ͷ");           //���ö�����вη���  

}  
}  
