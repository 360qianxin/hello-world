package chapter1;

interface Eat  //定义一个接口  
{  
    void eat();  

}  

 
class Cow implements Eat //实现接口。  
{  
    public String name="牛哞哞";       //定义自己的字段  
    public void eat()   //实现接口，注意访问修饰符加public  
    {  
       System.out.println("母牛爱吃青草");  
    }  
}  
class Hen implements Eat //实现接口。  
{  
    public String name="鸡咯咯";       //定义自己的字段  
    public void eat()   //实现接口，注意访问修饰符加public  
    {  
       System.out.println("母鸡爱吃小虫");  
    }  
}  
 
public class Example9  
{  
public static void main(String[] args)  
{  
    //多态的实现,animalEat代表不同对象，表现出不同的行为  
Eat animalEat = new Cow(); //注意这种生成实例的方法，此处代表母牛  
    animalEat.eat();          //调用母牛的方法  
    //System.out.println(animalEat.name); //不能访问  
    animalEat=new Hen();       //注意这种生成实例的方法，此处代表母鸡  
    animalEat.eat();          //调用母鸡的方法  
    //System.out.println(animalEat.name);//不能访问  
}  
}  
