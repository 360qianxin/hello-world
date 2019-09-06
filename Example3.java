package chapter1;

class Example3  
{  
    public int x;          //非静态变量  
    public static int y;     //静态变量  
    void method()       //非静态方法  
    {  
        x = 1;   //正确,非静态方法可以访问非静态成员  
        y = 1;   //正确，非静态方法可以访问静态成员  
       System.out.println("实例方法访问：x="+x+" y="+y);  
    }  
    static void smethod()     //静态方法  
    {  
        //x = 3;  错误，静态方法不能非静态成员  
        y = 3;   //正确，静态方法可以访问静态成员  
       System.out.println("静态方法访问：y="+y);  
    }  
    public static void main(String[] args)  
    {  
    Example3 prog3 = new Example3();//生成类的实例  
        prog3.method();    //非静态方法通过实例来调用  
   
        Example3.smethod();  //静态方法通过类名来调用  
    }  
}  
