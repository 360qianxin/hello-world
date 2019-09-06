package chapter1;
class mother  
{  
    public static String sex;//成员变量  
    public void method1()//父类成员方法1  
    {  
       System.out.println("母亲的方法1!");  
    }  
    public  void method2() //父类成员方法2  
    {  
       System.out.println("母亲的方法2!");  
    }  
}  
class boy extends mother //继承  
{  
    public  void method2() //改写父类成员方法,Java中方法均为虚方法  
    {  
       System.out.println("我自己的方法2!");  
    }  
}  
public class Example4  
{  
    public static void main(String[] args)  
    {  
        boy boys = new boy();  
        boy.sex = "女孩";//静态变量的继承  
       System.out.println("继承而来的字段sex的值为："+boy.sex);  
        boys.method1();//来自父类的方法  
        boys.method2();//自己改写后的方法  
    }}