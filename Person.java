package chapter1;

class A  
{  
    public int age;             //声明公共字段age  
   private String name;        //声明私有字段name,此时name为类的属性,下面通过公有方法进行访问  
   public String getName() {  
       return name;  
   }  
   public void setName(String name) {  
       this.name = name;  
   }  
    
   public void eat()           //定义无参数的eat方法  
   {  
      System.out.println("A can eat");  
   }  
   public void eat(String s)   //定义带参数的eat方法,实现方法重载  
   {  
      System.out.println("A can eat"+s);  
   }  
   public A()            //定义无参构造函数,注意无返回值定义,方法与类同名  
   {  
   }  
   public A(int age, String name) //重写一个带参数构造函数,注意无返回值定义,方法与类同名  
   {  
       this.age = age;         //前一个age为对象的字段,由this指定,后一个age为函数形参  
       this.name = name;       //前一个name为对象的属性,由this指定,因为在本类中可直接访问,后一个name为函数形参  
       }  
    
}  
public class Person  
{  
public static void main(String[] args)  
{  
    A A1 = new A();  //调用类的无参构造函数  
A1.age = 20;               //给对象的公有字段直接赋值  
A1.setName("zhangsan");      //必须使用公共方法才能给对象的属性赋值  
System.out.println("第一个人信息,姓名:"+A1.getName()+"年龄:"+A1.age);  
A1.eat();                  //调用对象的无参方法  
A A2 = new A(18, "lisi");//调用类的有参构造函数  
System.out.println("第二个人信息,姓名:" + A2.getName() + "年龄:" + A2.age);  
A2.eat(" 馒头");           //调用对象的有参方法  

}  
}  
