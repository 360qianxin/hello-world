package chapter1;

class Example3  
{  
    public int x;          //�Ǿ�̬����  
    public static int y;     //��̬����  
    void method()       //�Ǿ�̬����  
    {  
        x = 1;   //��ȷ,�Ǿ�̬�������Է��ʷǾ�̬��Ա  
        y = 1;   //��ȷ���Ǿ�̬�������Է��ʾ�̬��Ա  
       System.out.println("ʵ���������ʣ�x="+x+" y="+y);  
    }  
    static void smethod()     //��̬����  
    {  
        //x = 3;  ���󣬾�̬�������ܷǾ�̬��Ա  
        y = 3;   //��ȷ����̬�������Է��ʾ�̬��Ա  
       System.out.println("��̬�������ʣ�y="+y);  
    }  
    public static void main(String[] args)  
    {  
    Example3 prog3 = new Example3();//�������ʵ��  
        prog3.method();    //�Ǿ�̬����ͨ��ʵ��������  
   
        Example3.smethod();  //��̬����ͨ������������  
    }  
}  
